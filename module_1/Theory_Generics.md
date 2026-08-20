# Generics

## 1. Что такое Generics

Generics позволяют писать код, работающий с разными типами, сохраняя **типобезопасность**.

Главная идея:

> Один класс или метод может работать с разными типами, а конкретный тип определяется при использовании.

Без Generics часто нужен `Object` и приведение типа:

```java
String value = (String) box.getValue();
```

С Generics:

```java
Box<String> box = new Box<>("Hello");
String value = box.getValue();
```

---

## 2. Generic-класс

```java
public class Box<T> {

    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
```

`T` — параметр типа.

```java
Box<String>  // T → String
Box<Integer> // T → Integer
```

**Параметр типа:** `T` в `Box<T>`.

**Аргумент типа:** `String` в `Box<String>`.

---

## 3. Несколько параметров

```java
class Pair<K, V> {
    private K key;
    private V value;
}
```

```java
Pair<String, Integer>
```

Здесь:

```text
K → String
V → Integer
```

Распространённые обозначения:

```text
T — Type
E — Element
K — Key
V — Value
```

---

## 4. Generic-метод

Метод может иметь собственный параметр типа:

```java
public static <T> T getFirst(T[] array) {
    return array[0];
}
```

`<T>` пишется **перед возвращаемым типом**.

```java
String s = getFirst(names);      // T → String
Integer n = getFirst(numbers);   // T → Integer
```

Generic-класс:

```java
class Box<T>
```

→ `T` принадлежит классу.

Generic-метод:

```java
<T> T method(T value)
```

→ `T` принадлежит методу.

---

## 5. Ограничение типа — `extends`

```java
<T extends Number>
```

`T` должен быть `Number` или его наследником:

```text
Integer ✓
Double  ✓
Long    ✓
String  ✗
```

Теперь внутри метода доступны методы `Number`.

---

## 6. Wildcard `?`

```java
Box<?>
```

Означает:

> `Box` с неизвестным типом.

Подойдут:

```text
Box<String>
Box<Integer>
Box<User>
```

---

## 7. `? extends`

```java
Box<? extends Number>
```

Неизвестный тип, который является `Number` или его наследником.

```text
Box<Integer> ✓
Box<Double>  ✓
Box<Long>    ✓
Box<String>  ✗
```

Основная идея:

> `extends` → безопасно **читать**.

```java
Number value = box.getValue();
```

Записывать конкретное значение нельзя, потому что неизвестен точный тип.

---

## 8. `? super`

```java
Box<? super Integer>
```

Неизвестный тип, который является `Integer` или его родителем.

```text
Box<Integer> ✓
Box<Number>  ✓
Box<Object>  ✓
Box<Double>  ✗
```

Основная идея:

> `super` → безопасно **записывать**.

```java
box.setValue(100);
```

При чтении гарантированно можем получить только `Object`:

```java
Object value = box.getValue();
```

---

## 9. PECS

Producer Extends, Consumer Super

```text
? extends → читаем
? super   → записываем
```

---

## 10. Инвариантность

Даже если:

```text
Integer extends Number
```

это не означает:

```java
Box<Integer> → Box<Number> // ✗
```

Generic-типы в Java **инвариантны**.

Для таких случаев используются `? extends` и `? super`.
