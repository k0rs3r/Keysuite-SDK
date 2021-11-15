package it.kdm.orchestratore.appdoc.startup;

import it.kdm.doctoolkit.utils.Utils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FilePropertiesCheck {

    //TODO: Questa classe è duplicata

    private static final Logger logger = LoggerFactory.getLogger(FilePropertiesCheck.class);

    private static final String APP_NAME = "AppDoc";
    private static final String APP_CONF_FILE = APP_NAME + ".properties";

    public void init() {
        logger.info("initConfig method initConfig");

        File f1 = new File(Utils.getConfigHome(), APP_CONF_FILE);
        //String pathFileGlob = pathDirectory + sep + FrontendProperty;
        try {

            if (!f1.exists()) {
                logger.info("method initConfig: file non esiste: {}", f1.getAbsolutePath());
                logger.info("method initConfig: start copy...");
                try (InputStream in = FilePropertiesCheck.class.getResourceAsStream("/"+ APP_CONF_FILE);
                     OutputStream out = new FileOutputStream(f1)) {
                    IOUtils.copy(in, out);
                    logger.info("method initConfig: end copy...");
                }
            }

            //GESTIONE FILE DI LINGUA
            File dirPathLanguage = new File(Utils.getConfigHome(), APP_NAME);
            if(!dirPathLanguage.exists()){
                FileUtils.forceMkdir(dirPathLanguage);
            }
            PathMatchingResourcePatternResolver pathMRPR = new PathMatchingResourcePatternResolver();
            Resource[] resources = pathMRPR.getResources("classpath*:META-INF/resources/label/" + APP_NAME + "/messages*.properties");
            for(Resource resource : resources){
                File fileLanguage = new File(dirPathLanguage, resource.getFilename());
                if(!fileLanguage.exists()){
                    try(InputStream in = resource.getInputStream();
                        OutputStream out = new FileOutputStream(fileLanguage)) {
                        IOUtils.copy(in, out);
                    }
                }
            }

        } catch(Exception ex) {
            ex.printStackTrace();
            logger.error("Starting " + APP_NAME + " error.",ex.getMessage());
        }
    }
}
