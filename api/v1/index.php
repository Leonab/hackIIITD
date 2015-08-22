<?php
    require 'connect.php';
    require 'Slim/Slim.php';
    \Slim\Slim::registerAutoloader();
    $app = new \Slim\Slim();
    $app->get('/court/lawyers','getAllLawyers');
    $app->get('/court/cases','getAllCases');
    $app->post('/court/add', 'addCase');
    $app->post('/court/modify', 'modifyCase');
    $app->post('/lawyers/cases', 'getAllLawyerCases');
    $app->post('/lawyers/nexthearing', 'addnexthearing');
    $app->post('/department/tasks', 'getAllTasks');
    //$app->delete('/updates/delete/:update_id','deleteUpdate');
    //$app->get('/users/search/:query','getUserSearch');
    
    $app->run();
    function getAllLawyers(){
        $result= array();
        $connection = connect();
        $query = "SELECT * FROM `yogesh_manraj_experiments`.`iiitd_lawyer` ;";
        //echo $connection;
        $query = mysqli_query($connection,$query);
        while ($row = mysqli_fetch_array($query,MYSQL_ASSOC)){
            $row_array['id'] = $row['id'];
            $row_array['name'] = $row['name'];
            array_push($result,$row_array);
        }
        echo json_encode($result);
    }
    
    function getAllCases(){
        $connection = connect();
        $query = "SELECT * FROM `yogesh_manraj_experiments`.`iiitd_case` ;";
        //echo $connection;
        $query = mysqli_query($connection,$query);
        $result = mysqli_fetch_assoc($query);
        echo json_encode($result);
    }
    
    function addCase(){
        $request = \Slim\Slim::getInstance()->request();
        $connection = connect();
        $post_v =  $request->params();
        $query = "INSERT INTO `yogesh_manraj_experiments`.`iiit_case` (`description`, `lastStatus`,`department_id` ,`lawyer_id`, `status`) VALUES ('".$post_v["description"]."','0','".$post_v["department_id"]."','".$post_v["lawyer_id"]."','".$post_v["status"]."');";
        //echo $connection;
        //echo $query;
        $query = mysqli_query($connection,$query) or die(mysqli_error($connection));
        //echo $query;
        $result['response'] = 200;
        echo json_encode($result);
    }
    
    function modifyCase(){
        $request = \Slim\Slim::getInstance()->request();
        $connection = connect();
        $post_v =  $request->params();
        $query = "UPDATE `yogesh_manraj_experiments`.`iiit_case` SET `description`='".$post_v["description"]."',`lastStatus`='".$post_v["lastStatus"]."',`department_id`='".$post_v["department_id"]."',`lawyer_id`='".$post_v["lawyer_id"]."',`status`='".$post_v["status"]."' WHERE `id`='".$post_v["id"]."';";
        //echo $connection;
        //echo $query;
        $query = mysqli_query($connection,$query) or die(mysqli_error($connection));
        //echo $query;
        $result['response'] = 200;
        echo json_encode($result);
    }
    
    function getAllLawyerCases(){
        $request = \Slim\Slim::getInstance()->request();
        $connection = connect();
        $post_v =  $request->params();
        $query = "SELECT * FROM `yogesh_manraj_experiments`.`iiit_case` WHERE `lawyer_id`='".$post_v["lawyer_id"]."';";
        //echo $connection;
        //echo $query;
        $query = mysqli_query($connection,$query) or die(mysqli_error($connection));
        //echo $query;
        $result = mysqli_fetch_assoc($query);
        echo json_encode($result);
    }
    
    function addnexthearing(){
        $request = \Slim\Slim::getInstance()->request();
        $connection = connect();
        $post_v =  $request->params();
        $query = "INSERT INTO `yogesh_manraj_experiments`.`iiitd_hearing` (`date`, `notes`,`status` ,`associatedCase_id`) VALUES ('".$post_v["date"]."','".$post_v["notes"]."','".$post_v["status"]."','".$post_v["associatedCase_id"]."');";
        //echo $connection;
        //echo $query;
        $query = mysqli_query($connection,$query) or die(mysqli_error($connection));
        //echo $query;
        $result['response'] = 200;
        echo json_encode($result);
    }
    
    function getAllTasks(){
        $request = \Slim\Slim::getInstance()->request();
        $connection = connect();
        $post_v =  $request->params();
        $query = "SELECT * FROM `yogesh_manraj_experiments`.`iiitd_task` WHERE `department_id`='".$post_v["department_id"]."';";
        //echo $connection;
        //echo $query;
        $query = mysqli_query($connection,$query) or die(mysqli_error($connection));
        //echo $query;
        $result = mysqli_fetch_assoc($query);
        echo json_encode($result);
    }
    /*
    // GET http://www.yourwebsite.com/api/users
    function getUsers() {
        $sql = "SELECT user_id,username,name,profile_pic FROM users ORDER BY user_id DESC";
        try {
            $db = connect();
            $stmt = $db->query($sql); 
            $users = $stmt->fetchAll(PDO::FETCH_OBJ);
            $db = null;
            echo '{"users": ' . json_encode($users) . '}';
        } catch(PDOException $e) {
        //error_log($e->getMessage(), 3, '/var/tmp/phperror.log'); //Write error log
        echo '{"error":{"text":'. $e->getMessage() .'}}';
        }
    }
    
    // GET http://www.yourwebsite.com/api/updates
    function getUserUpdates() {
        $sql = "SELECT A.user_id, A.username, A.name, A.profile_pic, B.update_id, B.user_update, B.created FROM users A, updates B WHERE A.user_id=B.user_id_fk  ORDER BY B.update_id DESC";
        try {
            $db = connect();
            $stmt = $db->prepare($sql);
            $stmt->execute();  
            $updates = $stmt->fetchAll(PDO::FETCH_OBJ);
            $db = null;
            echo '{"updates": ' . json_encode($updates) . '}';
        } catch(PDOException $e) {
            echo '{"error":{"text":'. $e->getMessage() .'}}';
        }
    }
    
    // DELETE http://www.yourwebsite.com/api/updates/delete/10
    function deleteUpdate($update_id) {
        $sql = "DELETE FROM updates WHERE update_id=:update_id";
        try {
            $db = connect();
            $stmt = $db->prepare($sql); 
            $stmt->bindParam("update_id", $update_id);
            $stmt->execute();
            $db = null;
            echo true;
        } catch(PDOException $e) {
            echo '{"error":{"text":'. $e->getMessage() .'}}';
        }
    }
    
    // POST http://www.yourwebsite.com/api/updates
    function insertUpdate() {
        //....
        //....
    }
    
    function getUserUpdate($update_id) {
        //.....
        //.....
    }
    
    // GET http://www.yourwebsite.com/api/users/search/sri
    function getUserSearch($query) {
        //.....
        //....
    }*/
?>