## SWAGGER CON OpenAPI v3
Añadir dependencia al pom.xml

<dependency>
  <groupId>org.springdoc</groupId>
  <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
  <version>2.8.8</version>
</dependency>

### Swagger UI
http://localhost:8080/swagger-ui.html

### Especificación OpenAPI (json)
http://localhost:8080/v3/api-docs

### Cambiar puerto
(application.properties)
server.port=9090


## ANOTACIONES CON SPRING BOOT
Simplifica el desarrollo de aplicaciones web

@RestController
Clase que define un controlador REST. 
Los métodos manejan solicitudes HTTP y devuelven objetos como respuesta

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, world!";
    }
    
    @RequestMapping(value = "/greet", method = RequestMethod.GET)
    public String greet() {
        return "Greetings!";
    }
    
    @GetMapping("/user/{id}")
    public String getUser(@PathVariable int id) {
        return "User ID: " + id;
    }
    
    @GetMapping("/search")
    public String search(@RequestParam String query) {
        return "Search Query: " + query;
    }
    
    @PostMapping("/data")
    public String receiveData(@RequestBody String data) {
    	// Recibe datos JSON o XML en una solicitud POST o PUT.
        return "Received Data: " + data;
    }
        
    
    @GetMapping("/json")
    @ResponseBody // Devuelve datos JSON o XML
    public String sendJson() {    	
        return "{\"message\": \"Hello, JSON!\"}";
    }
    
    @GetMapping("/json2")
    @ResponseBody
    public ResponseEntity<?> sendJson2() {
        Map<String, Object> map = new HashMap<>();
        map.put("message", "Hello, world!");
        return ResponseEntity.ok(map);
    }
}


@Autowired
Permite la inyección de dependencias automática

@Service
public class MyService {
    public String getMessage() {
        return "Hello from MyService!";
    }
}

@RestController
public class MessageController {

    @Autowired
    private MyService myService;

    @GetMapping("/message")
    public String getMessage() {
        return myService.getMessage();
    }
}


@Controller
// Capa de presentación, responsable de manejar las solicitudes HTTP entrantes y enviar respuestas.

@Service
// Capa de servicio, contiene la lógica de negocio. Manipula los datos recuperados de la capa repositorio.

@Repository
// Capa de repositorio, responsable de acceder a la base de datos y realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar)