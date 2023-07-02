package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tech.blog.entities.User;
import com.tech.blog.dao.LikeDao;
import com.tech.blog.entities.Post;
import com.tech.blog.helper.ConnectionProvider;
import com.tech.blog.dao.PostDao;
import java.util.List;

public final class load_005fpost_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!--this is load post page....-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("    \n");
      out.write("    ");

        User user=(User)session.getAttribute("currentUser");
       
        
//       Thread.sleep(1000);
    PostDao d= new PostDao(ConnectionProvider.getConnection());
    int cid=Integer.parseInt(request.getParameter("cid"));
    List<Post> posts=null;
    if(cid==0){
    posts= d.getAllPost();
    }else{
        posts=d.getPostBYCatId(cid);
    }
    if(posts.size()==0){
        out.println("<h3 class='display-3 text-center'>no post in this category</h3>");
        return;
    }
    
for(Post p:posts){
    
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"col-md-6 mt-2\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("            <img class=\"card-img-top\" src=\" blog_pic/");
      out.print( p.getpPic() );
      out.write("\" alt=\"Card image cap\">\n");
      out.write("            \n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                <b>");
      out.print( p.getpTitle() );
      out.write("</b>\n");
      out.write("                <p>");
      out.print( p.getpContent() );
      out.write("</p>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("                <div class=\"card-footer text-center\">\n");
      out.write("                     ");

                        LikeDao ld= new LikeDao(ConnectionProvider.getConnection());
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                       <a href=\"#!\" onclick=\"doLike(");
      out.print( p.getpId());
      out.write(',');
      out.print( user.getId());
      out.write(")\"  class=\"btn btn-outline-primary btn-sm\"><i class=\"fa fa-thumbs-o-up\"></i><span class=\"like-counter\">");
      out.print( ld.countLikeOnPost(p.getpId()));
      out.write("</span></a>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <a href=\"show_blog_page.jsp?post_id=");
      out.print( p.getpId() );
      out.write("\" class=\"btn btn-outline-primary btn-sm\">Read more.....</a>\n");
      out.write("                    <a href=\"#!\" class=\"btn btn-outline-primary btn-sm\"><i class=\"fa fa-commenting-o\"></i><span>10</span></a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("    ");

    }
    
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </div>");
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
