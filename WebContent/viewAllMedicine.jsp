<%@page import="com.medtrack.db.*" %>
<%@page import="com.medtrack.services.*" %>
<%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--
Author: Vivek Patil
-->
<html>
<head>
<title>MedTrack</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Glance Design Dashboard Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>

<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />

<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

<!-- Custom CSS -->
<link href="css/style.css" rel='stylesheet' type='text/css' />

<!-- font-awesome icons CSS -->
<link href="css/font-awesome.css" rel="stylesheet"> 
<!-- //font-awesome icons CSS-->

<!-- side nav css file -->
<link href='css/SidebarNav.min.css' media='all' rel='stylesheet' type='text/css'/>
<!-- //side nav css file -->
 
 <!-- js-->
<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/modernizr.custom.js"></script>

<!--webfonts-->
<link href="//fonts.googleapis.com/css?family=PT+Sans:400,400i,700,700i&amp;subset=cyrillic,cyrillic-ext,latin-ext" rel="stylesheet">
<!--//webfonts--> 

<!-- chart -->
<script src="js/Chart.js"></script>
<!-- //chart -->

<!-- Metis Menu -->
<script src="js/metisMenu.min.js"></script>
<script src="js/custom.js"></script>
<link href="css/custom.css" rel="stylesheet">
<!--//Metis Menu -->
<style>
#chartdiv {
  width: 100%;
  height: 295px;
}
</style>
<!--pie-chart --><!-- index page sales reviews visitors pie chart -->
<script src="js/pie-chart.js" type="text/javascript"></script>
 <script type="text/javascript">

        $(document).ready(function () {
            $('#demo-pie-1').pieChart({
                barColor: '#2dde98',
                trackColor: '#eee',
                lineCap: 'round',
                lineWidth: 8,
                onStep: function (from, to, percent) {
                    $(this.element).find('.pie-value').text(Math.round(percent) + '%');
                }
            });

            $('#demo-pie-2').pieChart({
                barColor: '#8e43e7',
                trackColor: '#eee',
                lineCap: 'butt',
                lineWidth: 8,
                onStep: function (from, to, percent) {
                    $(this.element).find('.pie-value').text(Math.round(percent) + '%');
                }
            });

            $('#demo-pie-3').pieChart({
                barColor: '#ffc168',
                trackColor: '#eee',
                lineCap: 'square',
                lineWidth: 8,
                onStep: function (from, to, percent) {
                    $(this.element).find('.pie-value').text(Math.round(percent) + '%');
                }
            });

           
        });

    </script>
<!-- //pie-chart --><!-- index page sales reviews visitors pie chart -->

	<!-- requried-jsfiles-for owl -->
					<link href="css/owl.carousel.css" rel="stylesheet">
					<script src="js/owl.carousel.js"></script>
						<script>
							$(document).ready(function() {
								$("#owl-demo").owlCarousel({
									items : 3,
									lazyLoad : true,
									autoPlay : true,
									pagination : true,
									nav:true,
								});
							});
						</script>
					<!-- //requried-jsfiles-for owl -->
</head> 
<body class="cbp-spmenu-push">
	<div class="main-content">
        <div class="cbp-spmenu cbp-spmenu-vertical cbp-spmenu-left" id="cbp-spmenu-s1">
            <!--left-fixed -navigation-->
            <aside class="sidebar-left">
          <nav class="navbar navbar-inverse">
              <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".collapse" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                </button>
                <h1><a class="navbar-brand" href="user.html"><span class="fa fa-maxcdn"></span> MedTrack<span class="dashboard_text">Digital Transfer</span></a></h1>
              </div>
              <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="sidebar-menu">
                  <li class="header">MEDICAL NAVIGATION</li>
                  <li class="treeview">
                    <a href="viewAllMedicine.jsp">
                    <i class="fa fa-dashboard"></i> <span>View All Medicines</span>
                    </a>
                  </li>
                 <li class="treeview">
                    <a href="NearByMedicine.jsp">
                    <i class="fa fa-dashboard"></i> <span>View NearBy Medicines</span>
                    </a>
                  </li>
                  <li class="treeview">
                    <a href="NearByExpireMed.jsp">
                        <i class="fa fa-edit"></i>
                        <span>>Expire NearBy Medicines</span>
                    </a>
                  </li>
                  <li class="treeview">       
                    <a href="medicineCart.jsp">            <!-- ?? -->       
                        <i class="fa fa-laptop"></i>
                        <span>Medicine Cart</span>
                    </a>
                  </li> 
                  </li>                
                  <li>
                    <a href="index.html">
                    <i class="fa fa-th"></i> <span>Logout</span>
                    </a>
                  </li>         
                </ul>
              </div>
              <!-- /.navbar-collapse -->
          </nav>
        </aside>
        </div>
		<!--left-fixed -navigation-->
		
		<!-- header-starts -->
		<div class="sticky-header header-section ">
			<div class="header-left">
				<!--toggle button start-->
				<button id="showLeftPush"><i class="fa fa-bars"></i></button>
				<!--toggle button end-->
				
				<div class="profile_details_left"><!--notifications of menu start -->
					<ul class="nofitications-dropdown">
						<li class="dropdown head-dpdn">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-envelope"></i></a>			
						</li>						
					</ul>
					<div class="clearfix"> </div>
				</div>
				<!--notification menu end -->
				<div class="clearfix"> </div>
			</div>

			<div class="header-right">
							
				<!--search-box-->
				
				
				<div class="profile_details">		
					<ul>
						<li class="dropdown profile_details_drop">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
								<div class="profile_img">	
									<span class="prfil-img"><img src="images/2.jpg" alt=""> </span> 
									<div class="user-name">
										<p><%=UserInfo.getUname() %></p>
										<span><%=UserInfo.getUemail() %></span>
									</div>
									<i class="fa fa-angle-down lnr"></i>
									<i class="fa fa-angle-up lnr"></i>
									<div class="clearfix"></div>	
								</div>	
							</a>
							<ul class="dropdown-menu drp-mnu">
								<li> <a href="#"><i class="fa fa-suitcase"></i> Profile</a> </li> 
								<li> <a href="index.html"><i class="fa fa-sign-out"></i> Logout</a> </li>
							</ul>
						</li>
					</ul>
				</div>
				<div class="clearfix"> </div>				
			</div>
			<div class="clearfix"> </div>	
		</div>
		<!-- //header-ends -->
		<!-- main content start-->
					
	<!-- for amcharts js -->
			<script src="js/amcharts.js"></script>
			<script src="js/serial.js"></script>
			<script src="js/export.min.js"></script>
			<link rel="stylesheet" href="css/export.css" type="text/css" media="all" />
			<script src="js/light.js"></script>
	<!-- for amcharts js -->

    <script  src="js/index1.js"></script>
	
		 <div id="page-wrapper" style=" background-image: url(images/medtrack7.jpg); background-repeat: no-repeat; background-size:cover; background-position-x: center; background-position-y: center;">				
        	
        <div class="main-page">
        	<div class="inline-form widget-shadow">					
				<div class="form-body">
					<div data-example-id="simple-form-inline"> 
						<form action="viewAllMedicine.jsp" class="form-inline"> 
							<div class="form-group"> 
								<input type="text" name="search" class="form-control" id="exampleInputEmail3" placeholder="Search"> 
							</div> 						
						 <button type="submit" class="btn btn-outline-success btn-sm">Search</button>						  
						</form>
					</div>
				</div>
			</div>
            <div class="tables">
                                                                                    
                <div class="table-responsive bs-example widget-shadow">
                	
                    <h4 style="text-align: center;color: #35A29F;">Medicine Table</h4>
                    <table class="table table-bordered"> 
                        <thead>
                            <tr> 
                                <th>ID</th> 
                                <th>Medicine Name</th> 
                                <th>Brand Name</th> 
                                <th>Description</th> 
                                <th>Expire Date</th> 
                                <th>Quantity</th> 
                                <th>Price</th> 
                                <th>Discount</th> 
                                <th>Medical Name</th> 
                                <th>Contact</th> 
                                <th>Order</th>                       
                            </tr> 
                        </thead> 
                        <tbody> 
                        
         	<%
         		String search = request.getParameter("search");
    			try{
	    				
	    				if(search==null)
	    				{
	    					Connection con = ConnectDB.connect();
	        				String memail= MedicalInfo.getMemail();
	        				PreparedStatement ps = con.prepareStatement("SELECT * FROM medicine_tbl INNER JOIN medical_tbl ON medicine_tbl.memail= medical_tbl.memail;");				
	        				ResultSet rs = ps.executeQuery();
	        				while(rs.next())
	        				{
        	%>
        						<tr> 
                                    <th scope="row"><%=rs.getInt("med_id") %></th> 
                                    <td><%=rs.getString("med_name")%></td> 
                                    <td><%=rs.getString("med_brand")%></td>
                                    <td><%=rs.getString("med_desc")%></td>
                                    <td><%=rs.getString("med_exp")%></td>
                                    <td><%=rs.getString("med_qty")%></td>                            
                                    <td><%=rs.getInt("med_price")%></td>
                                    <td><%=rs.getString("med_discount") %></td>
                                    <td><%=rs.getString("mname") %></td>
                                    <td><%=rs.getString("mmobile") %></td>
                                    <td><a href="buy.jsp?med_id=<%=rs.getString("med_id")%>&uemail=<%=UserInfo.getUemail()%>&memail=<%=rs.getString("memail")%>" class="btn btn-outline-success btn-sm">Buy</a></td> 
                                </tr>
        	<%
        				
        					}	
    					}else
    					{
    						Connection con = ConnectDB.connect();
	        				String memail= MedicalInfo.getMemail();
	        				PreparedStatement ps = con.prepareStatement("SELECT * FROM medicine_tbl INNER JOIN medical_tbl ON medicine_tbl.memail= medical_tbl.memail where med_name like '%"+search+"%' OR med_desc like '%"+search+"%' ;");				
	        				ResultSet rs = ps.executeQuery();
	        				while(rs.next())
	        				{
        	%>
        						<tr> 
                                    <th scope="row"><%=rs.getInt("med_id") %></th> 
                                    <td><%=rs.getString("med_name")%></td> 
                                    <td><%=rs.getString("med_brand")%></td>
                                    <td><%=rs.getString("med_desc")%></td>
                                    <td><%=rs.getString("med_exp")%></td>
                                    <td><%=rs.getString("med_qty")%></td>                            
                                    <td><%=rs.getInt("med_price")%></td>
                                    <td><%=rs.getString("med_discount") %></td>
                                    <td><%=rs.getString("mname") %></td>
                                    <td><%=rs.getString("mmobile") %></td>
                                    <td><a href="#?med_id=<%=rs.getString("med_id")%>" class="btn btn-outline-success btn-sm">Buy</a></td> 
                                </tr>
        	<%
	        				}
    					}
				
 				
    			}catch(Exception e)
    			{    		
    				System.out.println("Something went wrong");
    				e.printStackTrace();
    			}
    		%>	  
                                     
                         </tbody> 
                    </table> 
                </div>
            </div>
        </div>
    </div>
		
		
		
				
		
		</div>
	<!--footer-->
	<div class="footer">
	   <p>&copy; 2023 MedTrack. All Rights Reserved | Design by <a href="https://github.com/vivekPatil45" target="_blank">Vivek Patil</a></p>		
	</div>
    <!--//footer-->
	</div>
		
	<!-- new added graphs chart js-->	
	<!-- new added graphs chart js-->
	
	<!-- Classie --><!-- for toggle left push menu script -->
		<script src="js/classie.js"></script>
		<script>
			var menuLeft = document.getElementById( 'cbp-spmenu-s1' ),
				showLeftPush = document.getElementById( 'showLeftPush' ),
				body = document.body;
				
			showLeftPush.onclick = function() {
				classie.toggle( this, 'active' );
				classie.toggle( body, 'cbp-spmenu-push-toright' );
				classie.toggle( menuLeft, 'cbp-spmenu-open' );
				disableOther( 'showLeftPush' );
			};
			

			function disableOther( button ) {
				if( button !== 'showLeftPush' ) {
					classie.toggle( showLeftPush, 'disabled' );
				}
			}
		</script>
	<!-- //Classie --><!-- //for toggle left push menu script -->
		
	<!--scrolling js-->
	<script src="js/jquery.nicescroll.js"></script>
	<script src="js/scripts.js"></script>
	<!--//scrolling js-->
	
	<!-- side nav js -->
	<script src='js/SidebarNav.min.js' type='text/javascript'></script>
	<script>
      $('.sidebar-menu').SidebarNav()
    </script>
	<!-- //side nav js -->
	
	<!-- for index page weekly sales java script -->
	
	
	<!-- Bootstrap Core JavaScript -->
   <script src="js/bootstrap.js"> </script>
	<!-- //Bootstrap Core JavaScript -->
	
</body>
</html>