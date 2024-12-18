package com.genderprediction;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class NameGenderPredictor {

  // Basic name-to-gender prediction (rule-based or simple dataset-based)
  public static String predictGender(String name) {
    // Simple rule-based approach (check suffixes of names)

    if (StringUtils.isBlank(name)) {
      return "Unknown";
    }

    String lowerCaseName = name.toLowerCase();
    // Gender prediction rules based on common name suffixes (extremely basic)
    if (lowerCaseName.endsWith("a") || lowerCaseName.endsWith("e")) {
      return "Female";
    } else if (lowerCaseName.endsWith("o") || lowerCaseName.endsWith("r")) {
      return "Male";
    } else {
      // Use dataset or more complex logic here
      return "Unknown";
    }
  }

  // Optional: Add advanced prediction using a machine learning model (e.g., Weka or pre-trained model)
  public static String predictGenderWithModel(String name) {
    // In a real-world application, you would load a machine learning model here
    // and pass the name through it for prediction. For now, let's just return a placeholder.
    return "Model prediction not implemented yet.";
  }
}
