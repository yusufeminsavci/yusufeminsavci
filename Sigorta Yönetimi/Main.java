package Java102.SigortaYonetim;
public class Main {
    public static void main(String[] args) {
        Java102.SigortaYonetim.AccountManager accountManager = new Java102.SigortaYonetim.AccountManager();
        Java102.SigortaYonetim.Account account = accountManager.login();
        System.out.println("Hoşgeldiniz " + account.getUser().getFname() + " " +
                account.getUser().getLname());
        account.addAddress("İnönü / Eskişehir");
        account.addAddress("Ayvacık / Çanakkale");
        account.addAddress("Çerkezköy / Tekirdağ");
        account.addInsurance(new Java102.SigortaYonetim.CarInsurance());
        account.showUserInfo();
    }
}
