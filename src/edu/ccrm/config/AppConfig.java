package edu.ccrm.config;
import java.nio.file.Path;
import java.nio.file.Paths;
	public class AppConfig{
	    private static AppConfig instance;
	    private Path dataFolder;
	    private AppConfig() {
	        dataFolder = Paths.get("ccrm_data");
	    }

	    public static AppConfig getInstance() {
	        if (instance == null) {
	            instance = new AppConfig();
	        }
	        return instance;
	    }

	    public Path getDataFolder() { return dataFolder; }

	    public static void main(String[] args) {
	        AppConfig cfg = AppConfig.getInstance();
	        System.out.println("Data folder: " + cfg.getDataFolder());
	    }
	}

