package Principles.Solid.DependencyInversion;

public interface AuthenticationService {
    boolean isAuthenticated(Object user);
}
