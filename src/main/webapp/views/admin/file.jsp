<%@ include file="header.jsp" %>

<body>
<form action="admin_uploadfile1"  enctype="multipart/form-data" method="post">
<input type="text" name="imgname" placeholder="Image name"></br>
<input type="text" name="imgtype" placeholder="Image type"></br>
<input type="text" name="price" placeholder="Image price"></br>
<input type="file" name="file" placeholder="Image"></br>
<input type="submit" value="Submit" />

</form>
</body>

<%@include file="footer.jsp"%>