use maven archetype id - 707 to create a simple maven webapp
Add following entry to D:\installations\apache-maven-3.0.4\conf\settings.xml	
	<server>  
        <id>my-tomcat</id>  
          <username>script</username>  
          <password>script</password>  
    </server>  
Add following entry to D:\installations\apache-tomcat-6.0.35\conf\tomcat-users.xml
<role rolename="manager-script"/>
<user username="script" password="script" roles="manager-script"/>	     
