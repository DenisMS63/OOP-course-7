package jobagency;

public interface Observer {
    // Наблюдатель, он будет получать уведомления
// В данном случае это человек, ищущий работу, получает уведомления от рекрутинговского агенства

        void receiveOffer(String nameCompany, int salary);

}
