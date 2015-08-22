<!doctype html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang=""> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8" lang=""> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9" lang=""> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js" lang="">
<!--<![endif]-->

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>Sceptre</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="img/favicon.png" type="image/icon">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="font-awesome/css/font-awesome.css">
    <link rel="stylesheet" href="css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="css/main.css">
    <link rel="stylesheet" href="css/md-buttons.css">
    <link rel="stylesheet" href="css/tabs.css">
    <link rel="stylesheet" href="css/bootstrap.vertical-tabs.css">
    <link href='http://fonts.googleapis.com/css?family=Lato:400,300' rel='stylesheet' type='text/css'>
    <script src="js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
    <script src="https://maps.googleapis.com/maps/api/js?sensor=false"></script>
</head>

<body>
    <!--[if lt IE 8]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->
    <?php include("views/nav.php");?>
    <div class="header">
        <div class="container intro">
            <div class="btn-group">
                <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Action <span class="caret"></span></button>
                <ul class="dropdown-menu">
                    <li><a href="?lawyer_id=-1">All</a></li>
                    <?php 
                        $url = "http://manrajsingh.in/hackathon/v1/court/lawyers";
                        $json = file_get_contents($url);
                        $json_data = json_decode($json, true);
                        foreach($json_data as $val)
                        {
                            echo "<li><a href=\"?lawyer_id=".$val['id']."\">Lawyer #".$val['id']."</a></li>";
                        }
                    ?>
                </ul>
            </div>
            <?php
                $url = "http://manrajsingh.in/hackathon/v1/court/cases";
                $json = file_get_contents($url);
                $json_data = json_decode($json, true);
                $LAWYER_ID =  isset($_GET['lawyer_id']) ? $_GET['lawyer_id'] : -1;
                foreach($json_data as $val) 
                {
                    if ($LAWYER_ID != -1 && $val['lawyer_id'] != $LAWYER_ID)
                        continue;
                    echo "<div class=\"bs-callout bs-callout-warning\" id=\"callout-modal-accessibility\">";
                    echo "<a href=\"timeline.php?case_id=".$val['id']."\"><h4>".$val['description']."</h4></a>";
                    echo "<p>".$val['lastStatus']."</p>";
                    echo "</div>";
                }
            ?>
        </div>
    </div>
    <?php include("views/footer.php");?>
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script>
        window.jQuery || document.write('<script src="js/vendor/jquery-1.11.2.min.js"><\/script>')
    </script>
    <script src="js/vendor/bootstrap.min.js"></script>
    <script src="js/main.js"></script>
    <script src="js/md-buttons.js"></script>
</body>

</html>
