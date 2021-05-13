import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {

    private static final String TOKEN = "1650580861:AAF5wCzaVoJ4svBMOzXA0jwTiTuvlH_sRkc";
    private static final String USERNAME = "VSEDETKAM_BOT";

    public String getBotUsername() {
        return USERNAME;
    }

    public String getBotToken() {
        return TOKEN;
    }

    public void onUpdateReceived(Update update) {
        if(update.getMessage()!=null && update.getMessage().hasText()) {
            String chat_id = update.getMessage().getChatId().toString();


            try {
                execute(new SendMessage(chat_id, "привет, друг " + update.getMessage().getText() ));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

        }

    }
}
