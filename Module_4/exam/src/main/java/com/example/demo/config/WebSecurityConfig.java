//package com.example.demo.config;
//
//import com.example.demo.service.impl.MyUserDetailServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private MyUserDetailServiceImpl myUserDetailService;
//
//    @Bean
//    public BCryptPasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(myUserDetailService).passwordEncoder(passwordEncoder());
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//                .formLogin()
//                    .defaultSuccessUrl("/home")
//                    .permitAll()
//                .and()
//                    .authorizeRequests().antMatchers("/home").permitAll()
////                    .antMatchers("/customer/create").hasRole("ADMIN")
////                    .antMatchers("/customer/edit").hasRole("ADMIN")
////                    .antMatchers("/employee/create").hasRole("ADMIN")
////                    .antMatchers("/employee/edit").hasRole("ADMIN")
////                    .antMatchers("/service/create").hasRole("ADMIN")
////                    .antMatchers("/service/edit").hasRole("ADMIN")
////                    .antMatchers("/contract/create").hasRole("ADMIN")
////                    .antMatchers("/contract/edit").hasRole("ADMIN")
//////                    .antMatchers("/student/create").access()
////                    .antMatchers("/customer").hasAnyRole("ADMIN", "USER")
////                    .antMatchers("/contract").hasAnyRole("ADMIN", "USER")
////                    .antMatchers("/service").hasAnyRole("ADMIN", "USER")
////                    .antMatchers("/customer/","/customer/create").hasAnyRole("ADMIN","USER")
//                    .antMatchers("/customer/{id}/update").hasRole("ADMIN")
//                    .antMatchers("/employee/","/employee/{id}/update").hasRole("ADMIN")
//                    .antMatchers("/employee/","/employee/{id}/delete").hasRole("ADMIN")
//                    .antMatchers("/employee/","/employee/create").hasRole("ADMIN")
////                    .antMatchers("/service/").hasRole("ADMIN")
////                    .antMatchers("/contract/").hasRole("ADMIN")
//                    .anyRequest().authenticated();
//        http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");
//
//
//    }
//}
