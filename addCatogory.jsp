<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="utf-8">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="ThemeBucket">
    <link rel="shortcut icon" href="images/favicon.png">

    <title>Add Category</title>

    <!--Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-reset.css" rel="stylesheet">
    <link href="css/font-awesome.css" rel="stylesheet" />
    <link href="css/font-awesome1.css" rel="stylesheet" />
    <link rel="stylesheet" href="css/bootstrap-switch.css" />
    <link rel="stylesheet" type="text/css" href="css/select2.css" />

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
    <section id="main-content" class="">
    <section class="wrapper">
        <!-- page start-->
        <!-- page start-->
      <div class="row">
    	<div class="col-lg-12">
           <section class="panel">
                    <header class="panel-heading">
                        Add Category
                    </header>
             <div class="panel-body">
                 
                      <form class="form-horizontal" role="form" action="${pageContext.request.contextPath }/CategoryController?flag=insert" method="post">
                      
                      <div class="form-group">
                                <label for="inputEmail1" class="col-lg-2 col-sm-2 control-label">Add Category</label>
                                	<div class="col-lg-5">
                                    	<input type="text" class="form-control" name="categoryName" id="inputEmail1" placeholder="Category Name">
                                    </div>
                            </div>
                            <div class="form-group">
                                <div class="col-lg-offset-2 col-lg-10">
                                    <button type="submit" class="btn btn-danger">Add</button>
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



</body>
</html>
