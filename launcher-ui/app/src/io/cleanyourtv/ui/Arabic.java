package io.cleanyourtv.ui;

/** Arabic translations for the custom UI. */
final class Arabic {
    private Arabic() {}

    static String text(String english) {
        switch (english) {
            case "Live TV": return "التلفزيون المباشر";
            case "All Apps": return "جميع التطبيقات";
            case "Settings": return "الإعدادات";
            case "Home Settings": return "إعدادات الشاشة الرئيسية";
            case "TV Settings": return "إعدادات التلفزيون";
            case "HDMI Inputs": return "مداخل HDMI";
            case "Inputs": return "المداخل";
            case "Shortcuts": return "الاختصارات";
            case "Weather": return "الطقس";
            case "No weather data right now.": return "لا توجد بيانات للطقس حاليًا.";
            case "Sunrise ": return "شروق الشمس ";
            case "Sunset ": return "غروب الشمس ";
            case "Crypto": return "العملات الرقمية";
            case "24h change": return "التغير خلال 24 ساعة";
            case "For You": return "من أجلك";
            case "Trending Movies & Shows": return "الأفلام والمسلسلات الرائجة";
            case "Couldn't open ": return "تعذر فتح ";
            case "Language": return "اللغة";
            case "Temperature": return "درجة الحرارة";
            case "Theme": return "المظهر";
            case "Automatic": return "تلقائي";
            case "Light": return "فاتح";
            case "Dark": return "داكن";
            case "Weather widget": return "أداة الطقس";
            case "City": return "المدينة";
            case "Searching…": return "جارٍ البحث…";
            case "Type the city's name": return "اكتب اسم المدينة";
            case "Search": return "بحث";
            case "Cancel": return "إلغاء";
            case "No city with that name.": return "لا توجد مدينة بهذا الاسم.";
            case "Quotes widget": return "أداة الاقتباسات";
            case "On": return "مفعّل";
            case "Off": return "معطّل";
            case "Shelf": return "الشريط";
            case "Remote Buttons": return "أزرار جهاز التحكم";
            case "Nothing": return "لا شيء";
            case "Not installed": return "غير مثبّت";
            case "OK or the arrows change the value.": return "استخدم OK أو الأسهم لتغيير القيمة.";
            case "OK picks, Back cancels.": return "اضغط OK للاختيار أو رجوع للإلغاء.";
            default:
                return english;
        }
    }
}
