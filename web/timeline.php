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
    <link rel="stylesheet" href="css/timeline.css">
    <link rel="stylesheet" href="css/md-buttons.css">
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
            <ul class="timeline">
          <?php
            $url = "http://manrajsingh.in/hackathon/v1/department/taskscase?case_id=" . $_GET['case_id'];
            $json = file_get_contents($url);
            $json_data = json_decode($json, true);
            foreach($json_data as $val)
            {
              ?>
                <li <?php if ($val['requirements'] == null) echo "class=\"timeline-inverted\""; ?>>
                  <div class="timeline-badge warning"><i class="glyphicon"></i></div>
                  <div class="timeline-panel">
                  <div class="timeline-heading">
                    <p><small class="text-muted"><i class="glyphicon glyphicon-time"></i> <?php echo date('m/d/Y', $val['deadline']); ?></small></p>
                  </div>
                  <div class="timeline-body">
                    <p><?php echo $val['requirements']; ?></p>
                  </div>
                </div>
                </li>
              <?php
            }
          ?>
        <!--<li class="timeline-inverted">
          <div class="timeline-badge danger"><i class="glyphicon"></i></div>
          <div class="timeline-panel">
            <div class="timeline-heading">
              <h4 class="timeline-title">wsdk swkjnc kwdsnk ,sk</h4>
              <p><small class="text-muted"><i class="glyphicon glyphicon-time"></i> 22 Aug, 2015</small></p>
            </div>
            <div class="timeline-body">
              <p>kcj djks sjv kjs skj sds.</p>
            </div>
          </div>
        </li>-->
    </ul>
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
