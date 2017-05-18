package randoop.generation.types;

import randoop.types.ReferenceType;

/** Represents an empty {@link TypeDomain} */
public class EmptyDomain implements TypeDomain {

  private EmptyDomain() {}

  private static EmptyDomain domain = new EmptyDomain();

  public static EmptyDomain createDomain() {
    return domain;
  }

  @Override
  public String toString() {
    return "[]";
  }

  @Override
  public boolean isEmpty() {
    return true;
  }

  @Override
  public TypeDomain restrictDown(ReferenceType upperBound) {
    return this;
  }

  @Override
  public TypeDomain restrictUp(ReferenceType lowerBound) {
    return this;
  }

  @Override
  public TypeDomain restrictDown(TypeDomain upperDomain) {
    return this;
  }

  @Override
  public boolean hasSupertypeOf(ReferenceType type) {
    return false;
  }

  @Override
  public boolean hasSubtypeOf(ReferenceType type) {
    return false;
  }

  @Override
  public TypeDomain restrictUp(TypeDomain lowerDomain) {
    return this;
  }
}
