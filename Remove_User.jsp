<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="utf-8">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="ThemeBucket">
    <link rel="shortcut icon" href="images/favicon.png">

    <title>Remove User</title>

    <!--Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.css" rel="stylesheet" />
    <link href="css/font-awesome1.css" rel="stylesheet" />

    
    

    <!-- Custom styles for this template -->
    <link href="css/style.css" rel="stylesheet">
    <link href="css/style1.css" rel="stylesheet">
	
    <link href="css/style-responsive.css" rel="stylesheet" />

</head>

<body>

<section id="container" >
<jsp:include page="Header.jsp"></jsp:include>
<jsp:include page="Menubar.jsp"></jsp:include>

    <!--main content start-->
 <section id="main-content">
        <section class="wrapper">
        <!-- page start-->

        <div class="row">
            <div class="col-sm-12">
                <section class="panel">
                    <header class="panel-heading">
                        Remove User
                        <span class="tools pull-right">
                            <a href="javascript:;" class="fa fa-chevron-down"></a>
                            <a href="javascript:;" class="fa fa-cog"></a>
                            <a href="javascript:;" class="fa fa-times"></a>
                         </span>
                    </header>
                    <div class="panel-body">
                        <div class="adv-table editable-table ">
                            <div class="clearfix">
                     
                            <table class="table table-striped table-hover table-bordered" id="editable-sample">
                                <thead>
                                <tr>
                                    <th>No.</th>
                                    <th>User Name</th>
                                    <th>Email Id</th>
                                    <th>Status</th>
                                    <th>Remove</th>
                                    
                                </tr>
                                </thead>
                                
                            </table>
                            </div>
                        </div>
                    </div>
                </section>
            </div>
        </div>
        <!-- page end-->
        </section>
    </section>
    <!--main content end-->
</section>



<script src="js/jquery-1.10.2.min.js"></script>
<script src="js/jquery-migrate.js"></script>

<script src="js/bootstrap.min.js"></script>
<script class="include" type="text/javascript" src="js/jquery.dcjqaccordion.2.7.js"></script>
<script src="js/jquery.scrollTo.min.js"></script>
<script src="js//jquery.slimscroll.js"></script>
<script src="js/jquery.nicescroll.js"></script>

<script type="text/javascript" src="js/jquery.dataTables.js"></script>
<script type="text/javascript" src="js/DT_bootstrap.js"></script>

<!--common script init for all pages-->
<script src="js/scripts.js"></script>

<!--script for this page only-->
<script src="js/table-editable.js"></script>

<!-- END JAVASCRIPTS -->
<script>
    jQuery(document).ready(function() {
        EditableTable.init();
    });
</script>

</body>
</html>
