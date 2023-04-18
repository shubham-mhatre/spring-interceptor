# spring-interceptor

two approach to implement spring interceptor.
approach 1:
1: create interceptor by implementing HandlerInterceptor interface and override preHandle method. mark this class with @Component annotation
2: create configuration class by implementing WebMvcConfigurer interface & override addInterceptors method. also autowired interceptor class & register it by addInterceptor()
![image](https://user-images.githubusercontent.com/55918816/232717828-d1aa9513-bf98-40f0-a561-d122685f5699.png)

approach 2:
1: create interceptor by implementing HandlerInterceptor interface and override preHandle method.
2: create Bean of class MappedInterceptor. here we can provide url patterns to be included, url pattern to be excluded & pass interceptor instance
![image](https://user-images.githubusercontent.com/55918816/232718785-2cdea608-c511-458b-8ed2-f3f27f3b9e72.png)

