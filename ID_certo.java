public class ID_certo {
    public interface ILogger {
        void log(String message);
    }
    
    public class ConsoleLogger implements ILogger {
        @Override
        public void log(String message) {
            System.out.println("[INFO] " + message);
        }
    }
    
    public class FileLogger implements ILogger {
        @Override
        public void log(String message) {
            // escreve a mensagem em um arquivo de log
        }
    }
    
    public class UserManager {
        private final ILogger logger;
        
        public UserManager(ILogger logger) {
            this.logger = logger;
        }
        
        public void addUser(String username, String password) {
            // adiciona um novo usuário
            logger.log("Usuário " + username + " criado.");
        }
    }
    
}
