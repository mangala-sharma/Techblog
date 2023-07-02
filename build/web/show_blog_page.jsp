<%@page import="com.tech.blog.dao.LikeDao"%>
<%@page import="java.text.DateFormat"%>
<%@page import="com.tech.blog.dao.UserDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.tech.blog.entities.Category"%>
<%@page import="com.tech.blog.entities.Post"%>
<%@page import="com.tech.blog.helper.ConnectionProvider"%>
<%@page import="com.tech.blog.dao.PostDao"%>
<%@page import="com.tech.blog.entities.User"%>
<%@page errorPage="error_page.jsp" %>


<%
    User user=(User)session.getAttribute("currentUser");
    if(user==null){
        response.sendRedirect("login_page.jsp");
    }
%>

<%
    int  postId=Integer.parseInt(request.getParameter("post_id"));
    PostDao d=new PostDao(ConnectionProvider.getConnection());
    Post p= d.getPostByPostId(postId);
%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><%= p.getpTitle() %></title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/mycss.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        
        <style>
            .post-title{
                font-weight: 100;
                font-size:30px;
            }
            .post-content{
                font-weight: 100;
                font-size:25px;
            }
            .post-date{
                font-style: italic;
                font-weight:bold;
            }
            .post-user-info{
                font-size:20px;
                
            }
            .row-user{
                border:1px solid #e2e2e2;
                padding-top:15px;
            }
            body{
                background: url(images/bgimg.jpg);
                background-attachment: fixed;
                background-size: cover;
            }
            </style>
            
            <div id="fb-root"></div>
<script async defer crossorigin="anonymous" src="https://connect.facebook.net/en_GB/sdk.js#xfbml=1&version=v17.0" nonce="sgyfqz9J"></script>
            
    </head>
    <body>
         <!--navbar-->
       <nav class="navbar navbar-expand-lg navbar-dark primary-background">
  <a class="navbar-brand" href="index.jsp"><span class="fa fa-asterisk">Tech Blog</span></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="profile.jsp"><span class="fa fa-bell-o">Learn Code</span><span class="sr-only">(current)</span></a>
      </li>
     
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
         <span class="fa fa-external-link">Categories</span>
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Programming</a>
          <a class="dropdown-item" href="#">Project Implementation</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Data Structure</a>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#"><span class="fa fa-address-book-o"></span>Contact</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#" data-toggle="modal" data-target="#add-post"><span class="fa fa-asterisk"></span>Do post</a>
      </li>
      
    </ul>
      <ul class="navbar nav mr-right">
          
       <li class="nav-item  ">
        <a class="nav-link text-white" href="#!" data-toggle="modal" data-target="#profile-model"><span class="fa fa-user-circle "></span><%=user.getName()%></a>
      </li>
       <li class="nav-item  ">
        <a class="nav-link text-white" href="LogoutServlet"><span class="fa fa-user-plus "></span>Log out</a>
      </li>
      </ul>
  </div>
</nav>
        <!--end of navbar-->
       
        <!--main content of body-->
        
        <div class="container">
            <div class="row my-4">
            <div class="col-md-8 offset-md-2">
                
                <div class="card">
                    
                    <div class="card-header primary-background text-white">
                    <h4 class="post-title"><%= p.getpTitle()%></h4>
                    </div>
                    
                    <div class="card-body">
                       <img class="card-img-top my-2" src=" blog_pic/<%= p.getpPic() %>" alt="Card image cap">
                       
                       <div class="row my-3 row-user">
                           
                           <div class="col-md-8">
                               
                               <%
                               UserDao dao= new UserDao(ConnectionProvider.getConnection());
                               %>
                               
                               
                               
                           <p class="post-user-info"><a href="#"><%= dao.getUserByUserId(p.getUserId()).getName()%> </a>has posted</p>
                          </div> 
                           
                           <div class="col-md-4">
                           <p class="post-date"><%= DateFormat.getDateTimeInstance().format(p.getpDate())%></p>
                          </div> 
                           
                           </div>
                       
                        <p class="post-content"><%= p.getpContent() %></p>
                        <br>
                        <br>
                        <div class="post-code">
                        <pre><%= p.getpCode() %></pre>
                        </div>
                    </div>
                        <div class="card-footer primary-background">
                        <%
                        LikeDao ld= new LikeDao(ConnectionProvider.getConnection());
                        %>
                        
                       <a href="#!" onclick="doLike(<%= p.getpId()%>,<%= user.getId()%>)"  class="btn btn-outline-light btn-sm"><i class="fa fa-thumbs-o-up"></i><span class="like-counter"><%= ld.countLikeOnPost(p.getpId())%></span></a>
                    
                    <a href="#!" class="btn btn-outline-light btn-sm"><i class="fa fa-commenting-o"></i><span>10</span></a>
                
                    </div>
                       
                       <div class="card-footer">
                           <div class="fb-comments" data-href="http://localhost:8084/techBlog/show_blog_page.jsp?post_id=<%= p.getpId() %>" data-width="" data-numposts="5"></div>
                       </div>
                </div>
                </div>
                </div>
            </div>
        
        <!--end of main content-->
        
        <!-- Modal -->
<div class="modal fade" id="profile-model" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header primary-backgroundbtext-white text-center">
        <h5 class="modal-title" id="exampleModalLongTitle">TechBlog</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
          <div class="container text-center">
             <img src="pic/<%= user.getProfile()%>" style="max-width:150px;">
              <h5 class="modal-title mt-3" id="exampleModalLongTitle"><%= user.getName()%></h5></div>
              
              <!--details-->
              <div id="profile-details">
              <table class="table">
  
  <tbody>
    <tr>
      <th scope="row">ID :</th>
      <td><%= user.getId() %></td>
      
    </tr>
    <tr>
      <th scope="row">Email :</th>
      <td><%= user.getEmail() %></td>
    </tr>
    <tr>
      <th scope="row">Gender :</th>
      <td><%= user.getGender() %></td>
    </tr>
    <tr>
      <th scope="row">Status :</th>
      <td><%= user.getAbout() %></td>
    </tr>
    <tr>
      <th scope="row">Registered on :</th>
      <td><%= user.getDatetime().toString() %></td>
    </tr>
    
  </tbody>
</table></div>
    
    <div id="profile-edit" style="display:none;">
      <h3 class="mt-2">  Edit carefully </h3>
      
      <!--enctype data for images-->
      
      <form action="EditServlet" method="post" enctype="multipart/form-data"> 
      <table class="table">
          <tr>
              <td>ID :</td>
              <td><%= user.getId() %></td>
          </tr>
          <tr>
              <td>Name :</td>
              <td><input type="text" class="form-control" name="user_name" value="<%= user.getName() %>"></td>
          </tr>
          <tr>
              <td>Email :</td>
              <td><input type="email" class="form-control" name="user_email" value="<%= user.getEmail() %>"></td>
          </tr>
          <tr>
              <td>Password :</td>
              <td><input type="password" class="form-control" name="user_password" value="<%= user.getPassword() %>"></td>
          </tr>
          <tr>
              <td>Gender :</td>
              <td><%= user.getGender().toUpperCase() %></td>
          </tr>
          <tr>
              <td>About :</td>
              <td><textarea rows="3" class="form-control" name="user_about">
                <%= user.getAbout() %>
                  </textarea>></td>
          </tr>
          <tr>
              <td>new profile pic:</td>
              <td><input type="file" name="image" class="form-control"></td>
          </tr>
          </table>
                  <div class="container text-center">
                      <button type="submit" class="btn btn-outline-primary ">Save</button>
                      </div>
      </form>
        </div>
    
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button id="edit-profile" type="button" class="btn btn-primary">Edit</button>
      </div>
    </div>
  </div>
</div>
        
        <!--end of profile modal-->
        
        <!--add post model-->
        
        <div class="modal" id="add-post" tabindex="-1" role="dialog">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">Provide the post details..</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
          
        <form id="add-post-form" action="AddPostServlet" method="post">
            <div class="form-group">
            <select class="form-control" name="cid">
                <option selected disabled>---select category---</option>
                
                <%
                PostDao postd= new PostDao(ConnectionProvider.getConnection());
                ArrayList<Category> list= postd.getAllCategories();
                for(Category c:list)
                {
                %>
                
                
                <option value="<%= c.getCid() %>"><%= c.getName() %></option>
                
                <% } %>
                </select>
                </div>
                
            <div class="form-group">
                <input name="pTitle" type="text" placeholder="Enter post title" class="form-control"/>
                </div>
            <div class="form-group">
                <textarea name="pContent" class="form-control" style="height:300px;" placeholder="Enter your content"></textarea>  
            </div>
            <div class="form-group">
                <textarea name="pCode" class="form-control" style="height:300px;" placeholder="Enter your program(if any)"></textarea>  
            </div>
            <div class="form-group">
                <label>Select your pic...</label>
               <input type="file" name="pic">
            </div>
                
                <div class="container text-center">
                    <button type="submit" class="btn btn-outline-primary">Post</button>
                </div>
            </form>
      
  </div>
</div>
        
        <!--end of post modal-->
        
        <%--javascript   --%>
        <script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
       
      <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js" integrity="sha512-AA1Bzp5Q0K1KanKKmvN/4d3IRKVlv9PYgwFPvm32nPO6QS8yH1HO7LbgB1pgiOxPtfeg5zEn2ba64MUcqJx6CA==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
        <script src="js/myjs.js" type="text/javascript"></script>
        
        <script>
            $(document).ready(function(){
                let editStatus = false;
                $('#edit-profile').click(function()
                {
                    if(editStatus==false){
                    $("#profile-details").hide(); 
                    $("#profile-edit").show();
                    editStatus=true;
                    $(this).text("Back");
        }else{
             $("#profile-details").show(); 
                    $("#profile-edit").hide();
                    editStatus=false;
                     $(this).text("Edit");
        }
                })
            });
        </script>
        
        <!--now add post-->
        <script>
            $(document).ready(function(e){
                
                $("#add-post-form").on("submit",function(event){
                    //this code gets called when form is submitted.....
                    
                    event.preventDefault();
                    console.log("you are clicked on submitted");
                    let form=new FormData(this);
                    
                    //now requesting to server
                    $.ajax({
                        url:"AddPostServlet",
                        type:'POST',
                        data:form,
                        success:function (data, textStatus, jqXHR){
                            //success
                            console.log(data);
                            if(data.trim()== 'done'){
                                swal("Good job!", "saved successfully", "success");
                            }else{
                                 swal("Error!", "Something went wrong try again ....", "error");
                            }
                            
                        },
                        error:function(jqXHR, textStatus, errorThrown){
                            //error thrown
                            swal("Error!", "Something went wrong try again ....", "error");
                        },
                        
                        processData:false,
                        contentType:false,
                    })
                    
                })
            })
            </script>
        
    </body>
</html>
