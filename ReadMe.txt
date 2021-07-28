Spring涉及到的注解：


@Configuration
	示例：@Configuration
    	表明该类为 一个配置类

@ComponentScan()
    	示例:@ComponentScan("cn.swust.test")
    	value属性：是需要扫面注解的包名
    	通常用在配置类上，比如容器类。

@Component()  与（@Controller, @Service, @Repository 作用相同，都是表示这是Bean，但有各自的'含义'吧）
    示例:@Component("human1") 或 @Component
    value属性：表示该类在容器中的对象的名字，通常与@AutoWired @Qualifier("human1") 配合 用来指定注入其他类的属性中
    标明这个类是一个Bean

    用法示例
    @Component("dog")
    public class Dog {
        @Value("旺财")
        public String name;
    }
    @Controller("user")
    public class User {
        @Value("IT666")
        public String name;


        @Autowired//默认按照需要注入的Type类型注入，当容器中，存在多个该类型的对象，则需要配合@Qualifier（"name"）指定 。
        @Qualifier("dog")//
        public Dog dog;

        @Resource(name = "...", type = "...")而@Resource默认按照name--nickName注入，当指定name或默认name匹配不到时，回退到类型匹配，也可指定name或类型匹配。
        private String nickName;

    }

@Lazy
    示例：@Lazy
    可用在类，方法，属性上， 表示延迟加载（在Bean容器初始化时不加载，在用到的时候再加载）




SpringMVC涉及到的注解：

 @RequestMapping("/hehe")

	示例：
	@Controller
 	@RequestMapping("/happy")
 	blic class HappyController  {

 	@Autowired
	private HappyService happyService;
  
 	@RequestMapping(/hello/*)
 	public void sayHello(){
		//请求为 /happy/hello/* 都会进入这个方法！
		//例如：/happy/hello/123   /happy/hello/adb
		//可以通过get/post 请求
 	}
 	@RequestMapping(value="/haha",method=RequestMethod.GET)
 	public void sayHaHa(){
 	//只能通过get请求
 		}
		...
	}
	
	
@RequestParam(value = "", required = false)
	  将请求的参数绑定到参数上，默认情况required = true，参数必须传入。
  
	@RequestMapping("/happy")
 	public String sayHappy(
 	@RequestParam(value = "name", required = false) String name,
 	@RequestParam(value = "age", required = true) String age) {
 	//age参数必须传 ，name可传可不传
 		...
 	}

@PathValuable
	 将修饰的方法参数变为可供使用的uri变量

	中的参数可以是任意的简单类型，如int, long, Date等等。Spring会自动将其转换成合适的类型或者抛出 TypeMismatchException异常。当然我们也可以注册支持额外的数据类型。
	支持使用正则表达式，这就决定了它的超强大属性，它能在路径模板中使用占位符，可以设定特定的前缀匹配，后缀匹配等自定义格式。
	
	示例
	 @RequestMapping(value = "/seatrend/{petId}", method = RequestMethod.GET)
	 public void getSomeId(@PathVariable String petId, String petName){
	 	 //将参数与url上的{petId}与参数绑定
	 	//doSomething...
	 }
	

@ResponseBody

	示例：
	@ResponseBody是作用在方法上的，@ResponseBody 表示该方法的返回结果直接写入 HTTP response body 中，一般在异步获取数据时使用【也就是AJAX】，在使用 		@RequestMapping后，返回值通常解析为跳转路径，但是加上 @ResponseBody 后返回结果不会被解析为跳转路径，而是直接写入 HTTP response body 中。 比如异步获取 json 数据，加上 		@ResponseBody 后，会直接返回 json 数据。@RequestBody 将 HTTP 请求正文插入方法中，使用适合的 HttpMessageConverter 将请求体写入某个对象。

   @RequestMapping("/login.do")
   @ResponseBody 
    public Object login(String name, String password, HttpSession session) {
        user = userService.checkLogin(name, password);
        session.setAttribute("user", user);
        return new JsonResult(user);
    }
	

@RequestBody是作用在形参列表上，用于将前台发送过来固定格式的数据【xml 格式或者 json等】封装为对应的 JavaBean 对象，封装时使用到的一个对象是系统默认配置的 HttpMessageConverter进行解析，然后封装到形参上。
	示例：
    @RequestMapping("/login.do")
    @ResponseBody
    public Object login(@RequestBody User loginUuser, HttpSession session) {
        user = userService.checkLogin(loginUser);
        session.setAttribute("user", user);
        return new JsonResult(user);
    }
