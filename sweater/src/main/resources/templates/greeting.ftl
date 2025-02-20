<#import "parts/common.ftl" as c>
<#import "login.ftl" as l>

<#assign
    known = Session.SPRING_SECURITY_CONTEXT??
>
<#if known>
    <#assign
        user = Session.SPRING_SECURITY_CONTEXT.authentication.principal
        name = user.getUsername()
        isAdmin = user.isAdmin()
        currentUserId = user.getId()
    >
<#else>
    <#assign
        name = "Неавторизовано"
        isAdmin = false
        currentUserId = -1
    >
</#if>



<@c.page>
<h5> <#if user??>
         <p>Привет, ${name}</p>
     <#else>
         <p>Привет, гость!</p>
     </#if>  </h5>
<div>
    <p class="center">Это самое простое подобие Twitter</p>
</div>





</@c.page>
