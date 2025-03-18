package Lesson21treid;

/**
 * Основний клас, що запускає тестовий сценарій.
 */
class Lesson21treid {
    public static void main(String[] args) {
        int[] prices = {10, 8, 6, 12, 5, 15}; // Тестові ціни по днях

        Solution solution = new Solution(); // Створюємо об'єкт рішення
        double maxProfit = solution.maxProfit(prices); // Виконуємо стратегію

        // Виводимо підсумковий прибуток
        System.out.println("🏆 Остаточний прибуток: " + maxProfit + "$");
    }
}

/**
 * Клас Solution реалізує стратегію мартингейла для торгівлі акціями.
 */
class Solution {
    public double maxProfit(int[] prices) {
        // Ініціалізація змінних
        double bank = 10000; // Початковий банкрол
        double totalSpent = 0; // Сума витрат на купівлю акцій
        double totalShares = 0; // Кількість куплених акцій
        double avgPrice = 0; // Середня ціна куплених акцій
        double martingaleFactor = 2.5; // Коефіцієнт мартингейла (як множник інвестицій)
        double nextInvestment = 1; // Початкова інвестиція
        double maxProfit = 0; // Максимальний прибуток

        // Вивід початкової інформації
        System.out.println("📊 Початковий банк: " + bank + "$");
        System.out.println("─────────────────────────────────────────");

        // Проходимо по всіх днях торгівлі
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i]; // Поточна ціна акції
            System.out.println("📅 День " + (i + 1) + " | Ціна: " + price + "$");

            // 📉 Купівля акцій за стратегією мартингейла
            if (totalShares == 0 || price < avgPrice) {
                double amountToInvest = nextInvestment * martingaleFactor; // Обчислюємо суму інвестиції

                // Перевіряємо, чи вистачає грошей у банку
                if (bank >= amountToInvest) {
                    bank -= amountToInvest; // Віднімаємо інвестицію з банку
                    totalSpent += amountToInvest; // Додаємо витрати
                    totalShares += amountToInvest / price; // Розраховуємо кількість куплених акцій
                    avgPrice = totalSpent / totalShares; // Оновлюємо середню ціну покупки

                    // Визначаємо наступну інвестицію за мартингейлом
                    nextInvestment = (totalSpent + 1) * martingaleFactor;

                    // Виводимо інформацію про купівлю
                    System.out.printf("✅ Купівля: %.2f акцій\n", amountToInvest / price);
                    System.out.printf("💰 Витрачено: %.2f$\n", amountToInvest);
                    System.out.printf("📉 Нова середня ціна покупки: %.2f$\n", avgPrice);
                    System.out.printf("🏦 Банк після покупки: %.2f$\n", bank);
                } else {
                    System.out.println("❌ Недостатньо коштів для покупки!");
                }
            }
            // 📈 Продаж акцій при вигідній ціні
            else if (price > avgPrice) {
                double revenue = totalShares * price; // Розраховуємо прибуток від продажу
                bank += revenue; // Додаємо гроші в банк
                maxProfit = Math.max(maxProfit, bank - 10000); // Оновлюємо максимальний прибуток

                // Виводимо інформацію про продаж
                System.out.printf("💵 ПРОДАЖ: %.2f акцій\n", totalShares);
                System.out.printf("💰 Отримано: %.2f$\n", revenue);
                System.out.printf("🏦 Банк після продажу: %.2f$\n", bank);
                System.out.printf("📈 Поточний прибуток: %.2f$\n", (bank - 10000));

                // Обнулюємо змінні після продажу
                totalShares = 0;
                totalSpent = 0;
                nextInvestment = 1; // Починаємо новий цикл
            }

            System.out.println("─────────────────────────────────────────");
        }

        // Вивід фінального прибутку
        System.out.println("📊 Фінальний банк: " + bank + "$");
        System.out.println("💰 Максимальний прибуток: " + maxProfit + "$");
        return maxProfit; // Повертаємо прибуток
    }
}