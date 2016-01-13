<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="ThemeBucket">
    <link rel="shortcut icon" href="images/favicon.png">

    <title>Add Artical</title>

    <!--Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-reset.css" rel="stylesheet">
    <link href="css/font-awesome.css" rel="stylesheet" />
    <link href="css/font-awesome1.css" rel="stylesheet" />

    <link rel="stylesheet" href="css/bootstrap-switch.css" />
    <link rel="stylesheet" type="text/css" href="css/bootstrap-fileupload.css" />
    <link rel="stylesheet" type="text/css" href="css/bootstrap-wysihtml5.css" />

    <link rel="stylesheet" type="text/css" href="css/datepicker.css" />
    <link rel="stylesheet" type="text/css" href="css/timepicker.css" />
    <link rel="stylesheet" type="text/css" href="css/colorpicker.css" />
    <link rel="stylesheet" type="text/css" href="css/daterangepicker-bs3.css" />
    <link rel="stylesheet" type="text/css" href="css/datetimepicker.css" />

    <link rel="stylesheet" type="text/css" href="css/multi-select.css" />
    <link rel="stylesheet" type="text/css" href="css/jquery.tagsinput.css" />

    <link rel="stylesheet" type="text/css" href="css/select2.css" />

    <!-- Custom styles for this template -->
    <link href="css/style.css" rel="stylesheet">
    <link href="css/style1.css" rel="stylesheet">
    <link href="css/style-responsive.css" rel="stylesheet" />

    <!-- Just for debugging purposes. Don't actually copy this line! -->
    <!--[if lt IE 9]>
    <script src="js/ie8-responsive-file-warning.js"></script><![endif]-->

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<section id="container" >

<jsp:include page="Header.jsp"></jsp:include>
<jsp:include page="Menubar.jsp"></jsp:include>

<!--sidebar end-->
    <!--main content start-->
    <section id="main-content">
        <section class="wrapper">
        <!-- page start-->



<div class="row">
            <div class="col-md-12">
			 <section class="panel">
                    <header class="panel-heading">
                        Add Artical
                          <span class="tools pull-right">
                            <a class="fa fa-chevron-down" href="javascript:;"></a>
                            <a class="fa fa-cog" href="javascript:;"></a>
                            <a class="fa fa-times" href="javascript:;"></a>
                         </span>
                    </header>
                    <div class="panel-body">
                    	
                        <form action="#" class="form-horizontal ">
                        	<div class="form-group">
                   			     <label class="col-sm-3 control-label">Artical Title</label>
                       				 <div class="col-sm-7">
                            			<input type="text" class="form-control">
                        			</div>
                    		</div>
            				<div class="form-group">
                                <label class="control-label col-md-3">Artical Description</label>
                                <div class="col-md-9">
                                    <textarea class="wysihtml5 form-control" style="width:597px"rows="9"></textarea>
                                </div>
                            </div>
                            <div class="form-group last">
                                <label class="control-label col-md-3">Image Upload</label>
                                <div class="col-md-9">
                                    <div class="fileupload fileupload-new" data-provides="fileupload">
                                        <div class="fileupload-new thumbnail" style="width: 200px; height: 150px;">
                                            <img src="http://www.placehold.it/200x150/EFEFEF/AAAAAA&amp;text=no+image" alt="" />
                                        </div>
                                        <div class="fileupload-preview fileupload-exists thumbnail" style="max-width: 200px; max-height: 150px; line-height: 20px;"></div>
                                        <div>
                                                   <span class="btn btn-white btn-file">
                                                   <span class="fileupload-new"><i class="fa fa-paper-clip"></i> Select image</span>
                                                   <span class="fileupload-exists"><i class="fa fa-undo"></i> Change</span>
                                                   <input type="file" class="default" />
                                                   </span>
                                            <a href="#" class="btn btn-danger fileupload-exists" data-dismiss="fileupload"><i class="fa fa-trash"></i> Remove</a>
                                        </div>
                                    </div>
                                    
                                </div>
                            </div>

                        </form>
                    </div>
                </section>
            </div>
        </div>
		</section>
		</section>

</section>		
<script src="js/jquery.js"></script>
<script src="js/jquery-1.10.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery-ui-1.9.2.custom.min.js"></script>
<script class="include" type="text/javascript" src="js/jquery.dcjqaccordion.2.7.js"></script>
<script src="js/jquery.scrollTo.min.js"></script>
<script src="js/jquery.easypiechart.js"></script>
<script src="js/jquery.slimscroll.js"></script>
<script src="js/jquery.nicescroll.js"></script>
<script src="js/jquery.nicescroll.js"></script>

<script src="js/bootstrap-switch.js"></script>

<script type="text/javascript" src="js/spinner.min.js"></script>
<script type="text/javascript" src="js/bootstrap-fileupload.js"></script>
<script type="text/javascript" src="js/wysihtml5-0.3.0.js"></script>
<script type="text/javascript" src="js/bootstrap-wysihtml5.js"></script>

<script type="text/javascript" src="js/bootstrap-datepicker.js"></script>
<script type="text/javascript" src="js/bootstrap-datetimepicker.js"></script>
<script type="text/javascript" src="js/moment.min.js"></script>
<script type="text/javascript" src="js/daterangepicker.js"></script>
<script type="text/javascript" src="js/bootstrap-colorpicker.js"></script>
<script type="text/javascript" src="js/bootstrap-timepicker.js"></script>

<script type="text/javascript" src="js/jquery.multi-select.js"></script>
<script type="text/javascript" src="js/jquery.quicksearch.js"></script>

<script type="text/javascript" src="js/bootstrap-inputmask.min.js"></script>

<script src="js/jquery.tagsinput.js"></script>

<script src="js/select2.js"></script>
<script src="js/select-init.js"></script>
<script src="js/jquery.dcjqaccordion.2.7.js"></script>
<script src="js/skycons.js"></script>
<script src="js/jquery.easing.min.js"></script>
<script src="js/clndr.js"></script>
<script src="js/underscore-min.js"></script>
<script src="js/moment-2.2.1.js"></script>
<script src="js/evnt.calendar.init.js"></script>
<script src="js/jquery-jvectormap-1.2.2.min.js"></script>
<script src="js/jquery-jvectormap-us-lcc-en.js"></script>
<script src="js/gauge.js"></script>


<!--common script init for all pages-->
<script src="js/scripts.js"></script>

<script src="js/toggle-init.js"></script>

<script src="js/advanced-form.js"></script>
<!--Easy Pie Chart-->
<script src="js/jquery.easypiechart.js"></script>
<!--Sparkline Chart-->
<script src="js/jquery.sparkline.js"></script>
<!--jQuery Flot Chart-->
<script src="js/jquery.flot.js"></script>
<script src="js/jquery.flot.tooltip.min.js"></script>
<script src="js/jquery.flot.resize.js"></script>
<script src="js/jquery.flot.pie.resize.js"></script>


</body>
</html>

		
