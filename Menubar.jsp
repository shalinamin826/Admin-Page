<aside>
    <div id="sidebar" class="nav-collapse">
        <!-- sidebar menu start-->
        <div class="leftside-navigation">
            <ul class="sidebar-menu" id="nav-accordion">
                <li>
                    <a class="active" href="Index.jsp">
                        <i class="fa fa-dashboard"></i>
                        <span>Dashboard</span>
                    </a>
                </li>
                <li class="sub-menu">
                    <a href="javascript:;">
                        <i class="fa fa-book"></i>
                        <span>Manage Users</span>
                    </a>
                    <ul class="sub">
                        <li><a href="Add_User.jsp">Add User</a></li>
                        <li><a href="Remove_User.jsp">Remove User</a></li>
                    </ul>
                </li>
                <li>
                    <a href="fontawesome.html">
                        <i class="fa fa-bullhorn"></i>
                        <span>Manage Location</span>
                    </a>
                    <ul class="sub">
                        <li><a href="Add_Country.jsp">Add Country</a></li>
                        <li><a href="${pageContext.request.contextPath }/CountryController?flag=searchCountry">Search Country</a></li>
                        <li><a href="${pageContext.request.contextPath }/StateController?flag=loadCountry">Add State</a></li>
                        <li><a href="${pageContext.request.contextPath }/StateController?flag=searchState">Search State</a></li>
                        <li><a href="${pageContext.request.contextPath }/CityController?flag=loadCountryState">Add City</a></li>
                        <li><a href="${pageContext.request.contextPath }/CityController?flag=searchCity">Search City</a></li>
                    </ul>
                </li>
                <li>
                    <a href="fontawesome.html">
                        <i class="fa fa-bullhorn"></i>
                        <span>Manage Category and Subcategory</span>
                    </a>
                    <ul class="sub">
                        <li><a href="addCategory.jsp">Add Category</a></li>
                        <li><a href="${pageContext.request.contextPath }/CategoryController?flag=searchCategory">Search Category</a></li>
                        <li><a href="Add_Sub_Category.jsp">Add Sub-Category</a></li>
                        <li><a href="Remove_Sub_Category.jsp">Remove Sub-Category</a></li>
                    </ul>
                </li>
<!--                 <li class="sub-menu"> -->
<!--                     <a href="javascript:;"> -->
<!--                         <i class="fa fa-th"></i> -->
<!--                         <span>Data Tables</span> -->
<!--                     </a> -->
<!--                     <ul class="sub"> -->
<!--                         <li><a href="basic_table.html">Basic Table</a></li> -->
<!--                         <li><a href="responsive_table.html">Responsive Table</a></li> -->
<!--                         <li><a href="dynamic_table.html">Dynamic Table</a></li> -->
<!--                         <li><a href="editable_table.html">Editable Table</a></li> -->
<!--                     </ul> -->
<!--                 </li> -->
                <li class="sub-menu">
                    <a href="Manage_Req.jsp">
                        <i class="fa fa-tasks"></i>
                        <span>Manage Request</span>
                    </a>
                </li>
                <li class="sub-menu">
                    <a href="Manage_Follow.jsp">
                        <i class="fa fa-envelope"></i>
                        <span>Manage Follow</span>
                    </a>
                </li>
                <li class="sub-menu">
                    <a href="javascript:;">
                        <i class=" fa fa-bar-chart-o"></i>
                        <span>Manage Quetion/Answer</span>
                    </a>
                    <ul class="sub">
                        <li><a href="morris.html">Quetions</a></li>
                        <li><a href="chartjs.html">Answers</a></li>                        
                    </ul>
                </li>
                <li class="sub-menu">
                    <a href="javascript:;">
                        <i class=" fa fa-bar-chart-o"></i>
                        <span>Manage News</span>
                    </a>
                    <ul class="sub">
                        <li><a href="Add_News.jsp">Add News</a></li>
                        <li><a href="Remove_News.jsp">Remove News</a></li>
                    </ul>
                </li>
                <li class="sub-menu">
                    <a href="javascript:;">
                        <i class="fa fa-glass"></i>
                        <span>Manage Notifications</span>
                    </a>
                    <ul class="sub">
                        <li><a href="blank.html">Add Notification</a></li>
                        <li><a href="lock_screen.html">Remove Notification</a></li>                        
                    </ul>
                </li>
                <li>
                    <a href="login.html">
                        <i class="fa fa-user"></i>
                        <span>Mange Articals</span>
                    </a>
                    <ul class="sub">
                        <li><a href="Add_Artical.jsp">Add Articals</a></li>
                        <li><a href="Remove_Artical.jsp">Remove Articals</a></li>                        
                    </ul>
                </li>
            </ul>            </div>
        <!-- sidebar menu end-->
    </div>
</aside>
