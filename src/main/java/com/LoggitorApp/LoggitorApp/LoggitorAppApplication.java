package com.LoggitorApp.LoggitorApp;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.LoggitorApp.LoggitorApp.domain.Permission;
import com.LoggitorApp.LoggitorApp.domain.PermissionRepository;
import com.LoggitorApp.LoggitorApp.domain.Role;
import com.LoggitorApp.LoggitorApp.domain.RoleRepository;
import com.LoggitorApp.LoggitorApp.domain.User;



@SpringBootApplication
public class LoggitorAppApplication {

	@Autowired 
    private com.LoggitorApp.LoggitorApp.domain.UserRepository UserRepository ;
	
	@Autowired 
    private RoleRepository Rolerepository;
	@Autowired
	private PermissionRepository perRepository;
	public static void main(String[] args) {
		SpringApplication.run(LoggitorAppApplication.class, args);
	}
	@Bean
    CommandLineRunner runner(){
      return args -> {
    	  Permission per1 = new Permission("per1");
    	  perRepository.save(per1);
    	  Permission per2 = new Permission("per2");
    	  perRepository.save(per2);
    	  Permission per3 = new Permission("per3");
    	  perRepository.save(per3);
    	  
    	  Set<Permission> pers1= new HashSet<Permission>();
    	  pers1.add(per1);
    	  pers1.add(per2);
          Set<Permission> pers2= new HashSet<Permission>();
          pers2.add(per1);
          pers2.add(per3);
          Set<Permission> pers3= new HashSet<Permission>();
          pers3.add(per3);
          pers3.add(per2);
          //Add trip objects
          Role role1 = new Role("role1","desc1",pers1);
          Role role2 = new Role("role2","desc2",pers2);
          Role role3 = new Role("role3","desc3",pers3);
          Rolerepository.save(role1);
          Rolerepository.save(role2);
          Rolerepository.save(role3);

          // Add car object with link to owners and save these to db.
          
          Set<Role> Roles1= new HashSet<Role>();
          Roles1.add(role1);
          Roles1.add(role2);
          Set<Role> Roles2= new HashSet<Role>();
          Roles2.add(role1);
          Roles2.add(role3);
          Set<Role> Roles3= new HashSet<Role>();
          Roles3.add(role3);
          Roles3.add(role2);
    
          
          User user1 = new User("malik@gmail.com","0528432254","malik abed","pass1",Roles1);
          UserRepository.save(user1);
          User user2 = new User("asala@gmail.com","0528432254","asala","pass2",Roles2);
          UserRepository.save(user2);
          User user3 = new User("tawfek@gmail.com","0528432254","tawfek","pass3",Roles3);
          UserRepository.save(user3);
      };
	}

}

