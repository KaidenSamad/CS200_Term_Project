package provider;

import java.util.ArrayList;
import java.util.List;

public class ProviderManagement {
    private final List<Provider> providers = new ArrayList<>();

    public void addProvider(Provider provider) {
        providers.add(provider);
        System.out.println("Provider added: " + provider.getName());
    }

    public void editProvider(int providerId, Provider updatedProvider) {
        for (Provider provider : providers) {
            if (provider.getId() == providerId) {
                provider.setName(updatedProvider.getName());
                System.out.println("Provider updated: " + updatedProvider.getName());
                return;
            }
        }
        System.out.println("Provider not found.");
    }

    public void deleteProvider(int providerId) {
        providers.removeIf(provider -> provider.getId() == providerId);
        System.out.println("Provider deleted.");
    }
}
