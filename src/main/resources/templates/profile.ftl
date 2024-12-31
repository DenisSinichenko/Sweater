<#import "parts/common.ftl" as c>


<@c.page>
<h5>${username}</h5>
${message?ifExists}
<form method="post">

    <div class="form-group row">
        <label class="col-sm-2 col-form-label">Пароль:</label>
        <div class="col-sm-4">
            <input type="password" name="password" class="form-control" placeholder="Пароль" />
        </div>
    </div>

    <div class="form-group row">
            <label class="col-sm-2 col-form-label">E-mail:</label>
            <div class="col-sm-4">
                <input type="email" name="email" class="form-control" placeholder="name@mail.ru" value="${email!''}" />
            </div>
        </div>


    <input type="hidden" name="_csrf" value="${_csrf.token}" />

    <button class="btn btn-primary" type="submit">Сохранить</button>
</form>
</@c.page>