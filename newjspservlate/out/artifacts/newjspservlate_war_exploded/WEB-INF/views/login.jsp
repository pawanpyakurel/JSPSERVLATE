<%@include file="includes/header.jsp" %>

<form class="form-horizontal" action="login" method="post">
    <div class="form-group">
        <label for="username" class="col-sm-2 control-label">UserName</label>
        <div class="col-sm-10">
            <input type="text" name="user_name" class="form-control" id="username" placeholder="UserName">
        </div>
    </div>
    <div class="form-group">
        <label for="password" class="col-sm-2 control-label">Password</label>
        <div class="col-sm-10">
            <input type="password" name="password" class="form-control" id="password" placeholder="Password">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <div class="checkbox">
                <label>
                    <input type="checkbox"> Remember me
                </label>
            </div>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">Login</button>
        </div>
    </div>
</form>

<%@include file="includes/footer.jsp" %>
