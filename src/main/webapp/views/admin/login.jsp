<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@ include file="header.jsp" %>

 <div class="content-wrapper">
         <div class="container">
              <div class="row">
            
     <div class="col-md-6 col-sm-6 col-xs-12">
               <div class="panel panel-danger">
                        <div class="panel-heading">
                           LOGIN FORM
                        </div>
                        <div class="panel-body">
                            <form method="post" action="admin_login">
                                        
                                 <div class="form-group">
                                            <label>Enter Username</label>
                                            <input class="form-control" type="text" name="unm"/>
                                     
                                        </div>
                                            <div class="form-group">
                                            <label>Enter Password</label>
                                            <input class="form-control" type="password" name="pw" />
                                     
                                        </div>
                               
                                 
                                        <button type="submit" class="btn btn-danger">Login </button>

                                    </form>
                            </div>
                        </div>
                            </div>
                            </div>
                            </div>
                           </div>
    <%@ include file="footer.jsp" %>

</body>
</html>