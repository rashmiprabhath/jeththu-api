package srdp.projects.jeththu.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication
{

    public static void main( String[] args )
    {
        System.out.println( "Application runs.." );
        SpringApplication.run( DemoApplication.class, args );
    }
}
