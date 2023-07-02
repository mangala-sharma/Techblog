package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tech.blog.dao.LikeDao;
import java.text.DateFormat;
import com.tech.blog.dao.UserDao;
import java.util.ArrayList;
import com.tech.blog.entities.Category;
import com.tech.blog.entities.Post;
import com.tech.blog.helper.ConnectionProvider;
import com.tech.blog.dao.PostDao;
import com.tech.blog.entities.User;

public final class show_005fblog_005fpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error_page.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    User user=(User)session.getAttribute("currentUser");
    if(user==null){
        response.sendRedirect("login_page.jsp");
    }

      out.write('\n');
      out.write('\n');

    int  postId=Integer.parseInt(request.getParameter("post_id"));
    PostDao d=new PostDao(ConnectionProvider.getConnection());
    Post p= d.getPostByPostId(postId);

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>");
      out.print( p.getpTitle() );
      out.write("</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/mycss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            .post-title{\n");
      out.write("                font-weight: 100;\n");
      out.write("                font-size:30px;\n");
      out.write("            }\n");
      out.write("            .post-content{\n");
      out.write("                font-weight: 100;\n");
      out.write("                font-size:25px;\n");
      out.write("            }\n");
      out.write("            .post-date{\n");
      out.write("                font-style: italic;\n");
      out.write("                font-weight:bold;\n");
      out.write("            }\n");
      out.write("            .post-user-info{\n");
      out.write("                font-size:20px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .row-user{\n");
      out.write("                border:1px solid #e2e2e2;\n");
      out.write("                padding-top:15px;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background: url(images/bgimg.jpg);\n");
      out.write("                background-attachment: fixed;\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <!--navbar-->\n");
      out.write("       <nav class=\"navbar navbar-expand-lg navbar-dark primary-background\">\n");
      out.write("  <a class=\"navbar-brand\" href=\"index.jsp\"><span class=\"fa fa-asterisk\">Tech Blog</span></a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("        <a class=\"nav-link\" href=\"profile.jsp\"><span class=\"fa fa-bell-o\">Learn Code</span><span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("     \n");
      out.write("      <li class=\"nav-item dropdown\">\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("         <span class=\"fa fa-external-link\">Categories</span>\n");
      out.write("        </a>\n");
      out.write("        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Programming</a>\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Project Implementation</a>\n");
      out.write("          <div class=\"dropdown-divider\"></div>\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Data Structure</a>\n");
      out.write("        </div>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#\"><span class=\"fa fa-address-book-o\"></span>Contact</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#\" data-toggle=\"modal\" data-target=\"#add-post\"><span class=\"fa fa-asterisk\"></span>Do post</a>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("    </ul>\n");
      out.write("      <ul class=\"navbar nav mr-right\">\n");
      out.write("          \n");
      out.write("       <li class=\"nav-item  \">\n");
      out.write("        <a class=\"nav-link text-white\" href=\"#!\" data-toggle=\"modal\" data-target=\"#profile-model\"><span class=\"fa fa-user-circle \"></span>");
      out.print(user.getName());
      out.write("</a>\n");
      out.write("      </li>\n");
      out.write("       <li class=\"nav-item  \">\n");
      out.write("        <a class=\"nav-link text-white\" href=\"LogoutServlet\"><span class=\"fa fa-user-plus \"></span>Log out</a>\n");
      out.write("      </li>\n");
      out.write("      </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("        <!--end of navbar-->\n");
      out.write("       \n");
      out.write("        <!--main content of body-->\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row my-4\">\n");
      out.write("            <div class=\"col-md-8 offset-md-2\">\n");
      out.write("                \n");
      out.write("                <div class=\"card\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"card-header primary-background text-white\">\n");
      out.write("                    <h4 class=\"post-title\">");
      out.print( p.getpTitle());
      out.write("</h4>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                       <img class=\"card-img-top my-2\" src=\" blog_pic/");
      out.print( p.getpPic() );
      out.write("\" alt=\"Card image cap\">\n");
      out.write("                       \n");
      out.write("                       <div class=\"row my-3 row-user\">\n");
      out.write("                           \n");
      out.write("                           <div class=\"col-md-8\">\n");
      out.write("                               \n");
      out.write("                               ");

                               UserDao dao= new UserDao(ConnectionProvider.getConnection());
                               
      out.write("\n");
      out.write("                               \n");
      out.write("                               \n");
      out.write("                               \n");
      out.write("                           <p class=\"post-user-info\"><a href=\"#\">");
      out.print( dao.getUserByUserId(p.getUserId()).getName());
      out.write(" </a>has posted</p>\n");
      out.write("                          </div> \n");
      out.write("                           \n");
      out.write("                           <div class=\"col-md-4\">\n");
      out.write("                           <p class=\"post-date\">");
      out.print( DateFormat.getDateTimeInstance().format(p.getpDate()));
      out.write("</p>\n");
      out.write("                          </div> \n");
      out.write("                           \n");
      out.write("                           </div>\n");
      out.write("                       \n");
      out.write("                        <p class=\"post-content\">");
      out.print( p.getpContent() );
      out.write("</p>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"post-code\">\n");
      out.write("                        <pre>");
      out.print( p.getpCode() );
      out.write("</pre>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                        <div class=\"card-footer primary-background\">\n");
      out.write("                        ");

                        LikeDao ld= new LikeDao(ConnectionProvider.getConnection());
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                       <a href=\"#!\" onclick=\"doLike(");
      out.print( p.getpId());
      out.write(',');
      out.print( user.getId());
      out.write(")\"  class=\"btn btn-outline-light btn-sm\"><i class=\"fa fa-thumbs-o-up\"></i><span class=\"like-counter\">");
      out.print( ld.countLikeOnPost(p.getpId()));
      out.write("</span></a>\n");
      out.write("                    \n");
      out.write("                    <a href=\"#!\" class=\"btn btn-outline-light btn-sm\"><i class=\"fa fa-commenting-o\"></i><span>10</span></a>\n");
      out.write("                \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        <!--end of main content-->\n");
      out.write("        \n");
      out.write("        <!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"profile-model\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLongTitle\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header primary-backgroundbtext-white text-center\">\n");
      out.write("        <h5 class=\"modal-title\" id=\"exampleModalLongTitle\">TechBlog</h5>\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("          <span aria-hidden=\"true\">&times;</span>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("          <div class=\"container text-center\">\n");
      out.write("             <img src=\"pic/");
      out.print( user.getProfile());
      out.write("\" style=\"max-width:150px;\">\n");
      out.write("              <h5 class=\"modal-title mt-3\" id=\"exampleModalLongTitle\">");
      out.print( user.getName());
      out.write("</h5></div>\n");
      out.write("              \n");
      out.write("              <!--details-->\n");
      out.write("              <div id=\"profile-details\">\n");
      out.write("              <table class=\"table\">\n");
      out.write("  \n");
      out.write("  <tbody>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">ID :</th>\n");
      out.write("      <td>");
      out.print( user.getId() );
      out.write("</td>\n");
      out.write("      \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">Email :</th>\n");
      out.write("      <td>");
      out.print( user.getEmail() );
      out.write("</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">Gender :</th>\n");
      out.write("      <td>");
      out.print( user.getGender() );
      out.write("</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">Status :</th>\n");
      out.write("      <td>");
      out.print( user.getAbout() );
      out.write("</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">Registered on :</th>\n");
      out.write("      <td>");
      out.print( user.getDatetime().toString() );
      out.write("</td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("  </tbody>\n");
      out.write("</table></div>\n");
      out.write("    \n");
      out.write("    <div id=\"profile-edit\" style=\"display:none;\">\n");
      out.write("      <h3 class=\"mt-2\">  Edit carefully </h3>\n");
      out.write("      \n");
      out.write("      <!--enctype data for images-->\n");
      out.write("      \n");
      out.write("      <form action=\"EditServlet\" method=\"post\" enctype=\"multipart/form-data\"> \n");
      out.write("      <table class=\"table\">\n");
      out.write("          <tr>\n");
      out.write("              <td>ID :</td>\n");
      out.write("              <td>");
      out.print( user.getId() );
      out.write("</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("              <td>Name :</td>\n");
      out.write("              <td><input type=\"text\" class=\"form-control\" name=\"user_name\" value=\"");
      out.print( user.getName() );
      out.write("\"></td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("              <td>Email :</td>\n");
      out.write("              <td><input type=\"email\" class=\"form-control\" name=\"user_email\" value=\"");
      out.print( user.getEmail() );
      out.write("\"></td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("              <td>Password :</td>\n");
      out.write("              <td><input type=\"password\" class=\"form-control\" name=\"user_password\" value=\"");
      out.print( user.getPassword() );
      out.write("\"></td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("              <td>Gender :</td>\n");
      out.write("              <td>");
      out.print( user.getGender().toUpperCase() );
      out.write("</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("              <td>About :</td>\n");
      out.write("              <td><textarea rows=\"3\" class=\"form-control\" name=\"user_about\">\n");
      out.write("                ");
      out.print( user.getAbout() );
      out.write("\n");
      out.write("                  </textarea>></td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("              <td>new profile pic:</td>\n");
      out.write("              <td><input type=\"file\" name=\"image\" class=\"form-control\"></td>\n");
      out.write("          </tr>\n");
      out.write("          </table>\n");
      out.write("                  <div class=\"container text-center\">\n");
      out.write("                      <button type=\"submit\" class=\"btn btn-outline-primary \">Save</button>\n");
      out.write("                      </div>\n");
      out.write("      </form>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        <button id=\"edit-profile\" type=\"button\" class=\"btn btn-primary\">Edit</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        <!--end of profile modal-->\n");
      out.write("        \n");
      out.write("        <!--add post model-->\n");
      out.write("        \n");
      out.write("        <div class=\"modal\" id=\"add-post\" tabindex=\"-1\" role=\"dialog\">\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <h5 class=\"modal-title\">Provide the post details..</h5>\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("          <span aria-hidden=\"true\">&times;</span>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("          \n");
      out.write("        <form id=\"add-post-form\" action=\"AddPostServlet\" method=\"post\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("            <select class=\"form-control\" name=\"cid\">\n");
      out.write("                <option selected disabled>---select category---</option>\n");
      out.write("                \n");
      out.write("                ");

                PostDao postd= new PostDao(ConnectionProvider.getConnection());
                ArrayList<Category> list= postd.getAllCategories();
                for(Category c:list)
                {
                
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <option value=\"");
      out.print( c.getCid() );
      out.write('"');
      out.write('>');
      out.print( c.getName() );
      out.write("</option>\n");
      out.write("                \n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("                </select>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input name=\"pTitle\" type=\"text\" placeholder=\"Enter post title\" class=\"form-control\"/>\n");
      out.write("                </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <textarea name=\"pContent\" class=\"form-control\" style=\"height:300px;\" placeholder=\"Enter your content\"></textarea>  \n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <textarea name=\"pCode\" class=\"form-control\" style=\"height:300px;\" placeholder=\"Enter your program(if any)\"></textarea>  \n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label>Select your pic...</label>\n");
      out.write("               <input type=\"file\" name=\"pic\">\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("                <div class=\"container text-center\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-outline-primary\">Post</button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("      \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        <!--end of post modal-->\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.7.0.min.js\" integrity=\"sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("       \n");
      out.write("      <script src=\"https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js\" integrity=\"sha512-AA1Bzp5Q0K1KanKKmvN/4d3IRKVlv9PYgwFPvm32nPO6QS8yH1HO7LbgB1pgiOxPtfeg5zEn2ba64MUcqJx6CA==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\"></script>\n");
      out.write("        <script src=\"js/myjs.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                let editStatus = false;\n");
      out.write("                $('#edit-profile').click(function()\n");
      out.write("                {\n");
      out.write("                    if(editStatus==false){\n");
      out.write("                    $(\"#profile-details\").hide(); \n");
      out.write("                    $(\"#profile-edit\").show();\n");
      out.write("                    editStatus=true;\n");
      out.write("                    $(this).text(\"Back\");\n");
      out.write("        }else{\n");
      out.write("             $(\"#profile-details\").show(); \n");
      out.write("                    $(\"#profile-edit\").hide();\n");
      out.write("                    editStatus=false;\n");
      out.write("                     $(this).text(\"Edit\");\n");
      out.write("        }\n");
      out.write("                })\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        <!--now add post-->\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function(e){\n");
      out.write("                \n");
      out.write("                $(\"#add-post-form\").on(\"submit\",function(event){\n");
      out.write("                    //this code gets called when form is submitted.....\n");
      out.write("                    \n");
      out.write("                    event.preventDefault();\n");
      out.write("                    console.log(\"you are clicked on submitted\");\n");
      out.write("                    let form=new FormData(this);\n");
      out.write("                    \n");
      out.write("                    //now requesting to server\n");
      out.write("                    $.ajax({\n");
      out.write("                        url:\"AddPostServlet\",\n");
      out.write("                        type:'POST',\n");
      out.write("                        data:form,\n");
      out.write("                        success:function (data, textStatus, jqXHR){\n");
      out.write("                            //success\n");
      out.write("                            console.log(data);\n");
      out.write("                            if(data.trim()== 'done'){\n");
      out.write("                                swal(\"Good job!\", \"saved successfully\", \"success\");\n");
      out.write("                            }else{\n");
      out.write("                                 swal(\"Error!\", \"Something went wrong try again ....\", \"error\");\n");
      out.write("                            }\n");
      out.write("                            \n");
      out.write("                        },\n");
      out.write("                        error:function(jqXHR, textStatus, errorThrown){\n");
      out.write("                            //error thrown\n");
      out.write("                            swal(\"Error!\", \"Something went wrong try again ....\", \"error\");\n");
      out.write("                        },\n");
      out.write("                        \n");
      out.write("                        processData:false,\n");
      out.write("                        contentType:false,\n");
      out.write("                    })\n");
      out.write("                    \n");
      out.write("                })\n");
      out.write("            })\n");
      out.write("            </script>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
