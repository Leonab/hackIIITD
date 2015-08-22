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
    <link rel="stylesheet" href="css/dept.css">
    <link rel="stylesheet" href="css/md-buttons.css">
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
                
                <div class="col-md-7 text-center data">
                        <div class="col-md-8 graph-area">
                            <div class="graph-fig">
                                <img src="img/d3.png" style="max-height:80%; max-width:80%">
                            </div>
                            <div class="graph-info">
                                !(Welli lines)
                            </div>
                        </div>
                </div>

                <div class="col-md-5 notif">
                    <div class="notif-content">
                        <ul>
                            <li>
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                                tempor incididunt ut labore et dolore magna aliqua.
                            </li>

                            <li>
                            Ut enim ad minim veniam,
                            quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
                            consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
                            cillum dolore eu fugiat nulla pariatur.
                            </li>

                            <li>
                                 Excepteur sint occaecat cupidatat non
                            proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                            </li>
                        </ul>
                    </div>
                </div>

            </div>

            <div class="container intro-body">
                <div class="new-msg col-md-12">
                    New ones:
                </div>
                <div class="old-msg col-md-12">
                    Old ones
                </div>
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
