<?php 
    function connect() {
        $connection = mysqli_connect("localhost","yogesh_manraj","Manraj24061993","yogesh_manraj_experiments");
        if(mysqli_connect_errno($connection)) {
            return false;
        } else {
            return $connection;
        }
    }
?>