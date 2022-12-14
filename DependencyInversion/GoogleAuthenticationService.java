package Principles.Solid.DependencyInversion;

public class GoogleAuthenticationService implements AuthenticationService {
    @Override
    public boolean isAuthenticated(Object user) {
        // return true if user is authenticated
        return false;
    }
}
