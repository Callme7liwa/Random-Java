
@Controller
class exampleController {

    @GetMapping("/example")
    public String example(@RequestBody @Valid Contact user) {
        return "example";
    }
}