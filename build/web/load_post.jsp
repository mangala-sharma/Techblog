<%@page import="com.tech.blog.entities.User"%>
<%@page import="com.tech.blog.dao.LikeDao"%>
<!--this is load post page....-->

<%@page import="com.tech.blog.entities.Post"%>
<%@page import="com.tech.blog.helper.ConnectionProvider"%>
<%@page import="com.tech.blog.dao.PostDao"%>
<%@page import="java.util.List"%>

<div class="row">
    
    <%
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
    %>
    
    <div class="col-md-6 mt-2">
        <div class="card">
            <img class="card-img-top" src=" blog_pic/<%= p.getpPic() %>" alt="Card image cap">
            
            <div class="card-body">
                <b><%= p.getpTitle() %></b>
                <p><%= p.getpContent() %></p>
                
            </div>
                <div class="card-footer text-center">
                     <%
                        LikeDao ld= new LikeDao(ConnectionProvider.getConnection());
                        %>
                        
                       <a href="#!" onclick="doLike(<%= p.getpId()%>,<%= user.getId()%>)"  class="btn btn-outline-primary btn-sm"><i class="fa fa-thumbs-o-up"></i><span class="like-counter"><%= ld.countLikeOnPost(p.getpId())%></span></a>
                    
                    
                    <a href="show_blog_page.jsp?post_id=<%= p.getpId() %>" class="btn btn-outline-primary btn-sm">Read more.....</a>
                    <a href="#!" class="btn btn-outline-primary btn-sm"><i class="fa fa-commenting-o"></i><span>10</span></a>
                </div>

</div>
        </div>
    
    <%
    }
    %>
    
    
    </div>