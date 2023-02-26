public class SI_certo {
    public interface IWorker {
        void work();
    }
    
    public interface IManager {
        void hire();
        void dismiss();
    }
    
    public class Employee implements IWorker {
        @Override
        public void work() {
            // faz alguma tarefa
        }
    }
    
    public class Manager implements IWorker, IManager {
        @Override
        public void work() {
            // gerencia sua equipe
        }
        
        @Override
        public void hire() {
            // contrata um novo funcionário
        }
        
        @Override
        public void dismiss() {
            // demite um funcionário
        }
    }
    
    
}
