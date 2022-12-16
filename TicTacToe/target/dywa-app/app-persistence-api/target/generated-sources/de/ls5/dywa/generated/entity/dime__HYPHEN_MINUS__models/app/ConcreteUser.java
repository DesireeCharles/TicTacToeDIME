/* generated by info.scce.dime.generator.scheme.ModelGenerator */
package de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app;
@de.ls5.dywa.annotations.IdRef(id = 0L)
@de.ls5.dywa.annotations.OriginalName(name = "ConcreteUser")
@de.ls5.dywa.annotations.ShortDescription(description = "")
@de.ls5.dywa.annotations.LongDescription(description = "")
public interface ConcreteUser extends de.ls5.dywa.generated.util.Identifiable {
	@de.ls5.dywa.annotations.IdRef(id = 8L)
	@de.ls5.dywa.annotations.OriginalName(name = "baseUser")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.BaseUser getbaseUser();
	
	@de.ls5.dywa.annotations.IdRef(id = 8L)
	@de.ls5.dywa.annotations.OriginalName(name = "baseUser")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	void setbaseUser(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.BaseUser object);
	
	@de.ls5.dywa.annotations.IdRef(id = 9L)
	@de.ls5.dywa.annotations.OriginalName(name = "dywaSwitchedTo")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser getdywaSwitchedTo();
	
	@de.ls5.dywa.annotations.IdRef(id = 9L)
	@de.ls5.dywa.annotations.OriginalName(name = "dywaSwitchedTo")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	void setdywaSwitchedTo(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser object);
	

	// EXTENSION ATTRIBUTES

	// CUSTOM LIST IMPL
	static class CustomListImpl<T extends de.ls5.dywa.generated.util.Identifiable> extends java.util.AbstractList<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser> {
	
		private final java.util.List<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser> delegate;
		private final BiDirectionalHelper<T> bidirectionalHelper;
		private boolean bidirectionalDirtyFlag;
	
		public CustomListImpl(final java.util.List<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser> delegate) {
			this(delegate, null);
		}
	
		public CustomListImpl(final java.util.List<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser> delegate, final BiDirectionalHelper<T> bidirectionalHelper) {
			this.delegate = delegate;
			this.bidirectionalHelper = bidirectionalHelper;
		}
	
		@java.lang.Override
		public int size() {
			return this.delegate.size();
		}
	
		@java.lang.Override
		public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser get(int index) {
				return this.delegate.get(index);
		}
	
		@java.lang.Override
		public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser set(int index, de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser element) {
	
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser replaced = this.delegate.set(index, element);
	
			if (element.equals(replaced)) {
				return element;
			}
	
			if (this.bidirectionalHelper != null) {
				this.bidirectionalHelper.clearReference(element);
				this.bidirectionalHelper.setReference(replaced);
			}
	
			return replaced;
		}
	
		@java.lang.Override
		public void add(int index, de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser element) {
	
			if (!this.bidirectionalDirtyFlag) {
	
				this.bidirectionalDirtyFlag = true;
	
				this.delegate.add(index, element);
	
				if (this.bidirectionalHelper != null) {
					bidirectionalHelper.setReference(element);
				}
	
				this.bidirectionalDirtyFlag = false;
			}
		}
	
		@java.lang.Override
		public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser remove(int index) {
	
			if (!this.bidirectionalDirtyFlag) {
	
				this.bidirectionalDirtyFlag = true;
				final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser result = this.delegate.remove(index);
	
				if (this.bidirectionalHelper != null) {
					this.bidirectionalHelper.clearReference(result);
				}
	
				this.bidirectionalDirtyFlag = false;
				return result;
			}
	
			return null;
		}
	}
	
	static class BiDirectionalHelper<T extends de.ls5.dywa.generated.util.Identifiable> {
	
		final java.util.function.BiConsumer<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser, T> setter;
		final java.util.function.Function<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser, java.util.List<T>> getter;
		final T owner;
	
		public BiDirectionalHelper(
				java.util.function.BiConsumer<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser, T> setter,
				T owner) {
	
			this.setter = setter;
			this.getter = null;
			this.owner = owner;
		}
	
		public BiDirectionalHelper(
				java.util.function.Function<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser, java.util.List<T>> getter,
				T owner) {
	
			this.setter = null;
			this.getter = getter;
			this.owner = owner;
		}
	
		public void setReference(final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser p) {
	
			// list mode
			if (this.getter != null) {
				getter.apply(p).add(owner);
			}
			// single mode
			else {
				setter.accept(p, owner);
			}
		}
	
		public void clearReference(final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser p) {
	
			// list mode
			if (this.getter != null) {
				getter.apply(p).remove(owner);
			}
			// single mode
			else {
				setter.accept(p, null);
			}
		}
	}

	default ConcreteUser casted(){
		return this;
	}
}
