package resource.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class ResourceFileTest {
public static void main(String[] args) throws IOException {
	ApplicationContext context= new ClassPathXmlApplicationContext();
	Resource resource=context.getResource("‪file:/Users/Vural/Desktop/selam.txt");
	try {
		InputStream is=resource.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(is));
		String line;
		while ((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
	((ClassPathXmlApplicationContext) context).close();
}
}
