public class RU_certo {
    public void registerUser(String username, String password) {
        validateInput(username, password);
        saveUserToDatabase(username, password);
        sendConfirmationEmail(username);
    }

    private void validateInput(String username, String password) {
        // valida se os dados inseridos são válidos
    }

    private void saveUserToDatabase(String username, String password) {
        // salva o usuário no banco de dados
    }

    private void sendConfirmationEmail(String username) {
        // envia um email de confirmação para o usuário
    }
}
