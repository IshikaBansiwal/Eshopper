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
                           REGISTRATION FORM
                        </div>
                        <div class="panel-body">
                            <form method="post" action="admin_reg">
                            <div class="form-group">
                                            <label>Enter Name</label>
                                            <input class="form-control" name="aname" type="text" />
                                     
                                        </div>
                                        
                                       <!--  <div class="form-group">
                                            <label>Enter Contact</label>
                                            <input class="form-control" name="mob" type="text" />
                                     
                                        </div>
                                        <div class="form-group">
                                            <label>Enter Email</label>
                                            <input class="form-control" name="email" type="email" />
                                     
                                        </div>
                                         -->
                                 <div class="form-group">
                                            <label>Enter Username</label>
                                            <input class="form-control" name="unm" type="text" />
                                     
                                        </div>
                                            <div class="form-group">
                                            <label>Enter Password</label>
                                            <input class="form-control" name="pw" type="password" />
                                     
                                        </div>
                               
                                 
                                        <button type="submit" class="btn btn-danger">Register </button>

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