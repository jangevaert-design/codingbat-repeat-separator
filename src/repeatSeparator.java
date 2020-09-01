public class repeatSeparator {
  public String repeatSeparator(String word, String sep, int count) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < count; i++) {
      if (i < count - 1) {
        result.append(word).append(sep);
      } else {
        result.append(word);
      }

    }

    return result.toString();
  }
}
