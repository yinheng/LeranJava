package practise.android;

/**
 * Learning
 */
public class PackageManagerService {
    public void start() throws StartException {
        System.out.println("PackageManagerService启动");

    }

    public void install(Packages packages) {
        System.out.println("install package");
    }

    public void uninstall(Packages packages) {
        System.out.println("uninstall package");
    }

    public void loadPackage(Packages packages) {
        System.out.println("load package");
    }
}