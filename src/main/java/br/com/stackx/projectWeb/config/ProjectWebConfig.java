package br.com.stackx.projectWeb.config;

@Configuration
@EnableWebMVC
@ComponentsScan(basaPackges = {"br.com.projectWeb"})
public class ProjectWebConfig implements WebMVCConfigurer
{
	@Bean
	public InternalResourceViewResolver resolver()
	{
		System.out.println("### Inicializando o paranaué");
		
		InternalResourceViewRosolver resolver = new InternalResourceViewRosolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		
		return resolver;
	}
}
