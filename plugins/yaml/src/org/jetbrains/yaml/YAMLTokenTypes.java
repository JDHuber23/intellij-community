package org.jetbrains.yaml;

import com.intellij.psi.tree.TokenSet;

/**
 * @author: oleg
 */
public interface YAMLTokenTypes {
  YAMLElementType COMMENT = new YAMLElementType("comment");
  YAMLElementType WHITESPACE = new YAMLElementType("whitespace");
  YAMLElementType INDENT = new YAMLElementType("indent");
  YAMLElementType EOL = new YAMLElementType("Eol");

  YAMLElementType LBRACE = new YAMLElementType("{");
  YAMLElementType RBRACE = new YAMLElementType("}");
  YAMLElementType LBRACKET = new YAMLElementType("[");
  YAMLElementType RBRACKET = new YAMLElementType("]");
  YAMLElementType COMMA = new YAMLElementType(",");
  YAMLElementType COLON = new YAMLElementType(":");
  YAMLElementType QUESTION = new YAMLElementType("?");

  YAMLElementType DOCUMENT_MARKER = new YAMLElementType("---");
  YAMLElementType SEQUENCE_MARKER = new YAMLElementType("-");

  YAMLElementType SCALAR_KEY = new YAMLElementType("scalar key");
  YAMLElementType TEXT = new YAMLElementType("text");

  YAMLElementType SCALAR_STRING = new YAMLElementType("scalar string");
  YAMLElementType SCALAR_DSTRING = new YAMLElementType("scalar dstring");

  YAMLElementType SCALAR_LIST = new YAMLElementType("scalar list");
  YAMLElementType SCALAR_TEXT = new YAMLElementType("scalar text");

  TokenSet SCALAR_VALUES = TokenSet.create(
    SCALAR_TEXT,
    SCALAR_STRING,
    SCALAR_DSTRING,
    SCALAR_LIST,
    TEXT
  );

}
