package Principles.Solid.DependencyInversion;

public class App {
    private AuthenticationService authenticationService;

    public App(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }
}
