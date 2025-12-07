# Conflict Шийдвэрлэлт

## Conflict-ийн Дэлгэрэнгүй

`feature/add-multiply-validation`-ийг `develop` руу нэгтгэхэд `src/main/java/com/lab14/lab14/Multiplication.java` дээр merge conflict гарсан. Conflict нь `multiply` функцын Javadoc коммент дээр байсан.

## Шийдвэрлэлтийн Алхмууд

1. Онцлогын салбарт `git merge develop` ажиллуулсан.

2. `Multiplication.java` дээрх conflict-ийг тодорхойлсон:
   ```
   <<<<<<< HEAD
    * Үржүүлэх үйлдлийг гүйцэтгэх класс.
   =======
    * Үржүүлэх үйлдлийг гүйцэтгэх класс. Энэ класс нь хоёр тоог үржүүлнэ.
   >>>>>>> develop
   ```

3. Файлыг засварлаж, хоёр салбарын Javadoc комментийг нэгтгэсэн:
   ```java
   /**
    * Үржүүлэх үйлдлийг гүйцэтгэх класс. Энэ класс нь хоёр тоог үржүүлнэ.
    */
   ```

4. `git add src/main/java/com/lab14/lab14/Multiplication.java` ажиллуулсан.

5. `git commit` ажиллуулж merge-ийг дуусгасан (merge commit мессеж автоматаар үүснэ).

6. Салбарыг push хийж, PR үүсгэсэн.

## Хэрэглэсэн Git Командууд

```bash
# Develop салбарын өөрчлөлтийг татах
git fetch origin develop

# Develop-ийг feature салбар руу merge хийх
git merge origin/develop

# Conflict-ийг засварласны дараа
git add src/main/java/com/lab14/lab14/Multiplication.java

# Merge commit хийх
git commit

# Push хийх
git push origin feature/add-multiply-validation
```

## Үр Дүн

Conflict амжилттай шийдэгдэж, хоёр салбарын өөрчлөлтүүд нэгтгэгдсэн. PR-ээр merge хийсний дараа CI шалгалт (Checkstyle, 100% coverage) амжилттай болж, код develop салбарт нэгтгэгдсэн.

