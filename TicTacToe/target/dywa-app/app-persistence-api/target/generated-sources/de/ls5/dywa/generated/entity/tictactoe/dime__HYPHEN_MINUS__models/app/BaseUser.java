/* generated by info.scce.dime.generator.scheme.ModelGenerator */
package de.ls5.dywa.generated.entity.tictactoe.dime__HYPHEN_MINUS__models.app;
@de.ls5.dywa.annotations.IdRef(id = 1L)
@de.ls5.dywa.annotations.OriginalName(name = "BaseUser")
@de.ls5.dywa.annotations.ShortDescription(description = "")
@de.ls5.dywa.annotations.LongDescription(description = "")
public interface BaseUser extends de.ls5.dywa.generated.util.Identifiable {
	@de.ls5.dywa.annotations.IdRef(id = 9L)
	@de.ls5.dywa.annotations.OriginalName(name = "concreteUser")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	java.util.List<de.ls5.dywa.generated.entity.tictactoe.dime__HYPHEN_MINUS__models.app.ConcreteUser> getconcreteUser_ConcreteUser();
	
	@de.ls5.dywa.annotations.IdRef(id = 9L)
	@de.ls5.dywa.annotations.OriginalName(name = "concreteUser")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	void setconcreteUser_ConcreteUser(java.util.List<de.ls5.dywa.generated.entity.tictactoe.dime__HYPHEN_MINUS__models.app.ConcreteUser> object);
	
	@de.ls5.dywa.annotations.IdRef(id = 10L)
	@de.ls5.dywa.annotations.OriginalName(name = "password")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	java.lang.String getpassword();
	
	@de.ls5.dywa.annotations.IdRef(id = 10L)
	@de.ls5.dywa.annotations.OriginalName(name = "password")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	void setpassword(java.lang.String object);
	
	@de.ls5.dywa.annotations.IdRef(id = 11L)
	@de.ls5.dywa.annotations.OriginalName(name = "image")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	de.ls5.dywa.generated.util.FileReference getimage();
	
	@de.ls5.dywa.annotations.IdRef(id = 11L)
	@de.ls5.dywa.annotations.OriginalName(name = "image")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	void setimage(de.ls5.dywa.generated.util.FileReference object);
	
	@de.ls5.dywa.annotations.IdRef(id = 12L)
	@de.ls5.dywa.annotations.OriginalName(name = "firstName")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	java.lang.String getfirstName();
	
	@de.ls5.dywa.annotations.IdRef(id = 12L)
	@de.ls5.dywa.annotations.OriginalName(name = "firstName")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	void setfirstName(java.lang.String object);
	
	@de.ls5.dywa.annotations.IdRef(id = 13L)
	@de.ls5.dywa.annotations.OriginalName(name = "lastName")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	java.lang.String getlastName();
	
	@de.ls5.dywa.annotations.IdRef(id = 13L)
	@de.ls5.dywa.annotations.OriginalName(name = "lastName")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	void setlastName(java.lang.String object);
	
	@de.ls5.dywa.annotations.IdRef(id = 14L)
	@de.ls5.dywa.annotations.OriginalName(name = "username")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	java.lang.String getusername();
	
	@de.ls5.dywa.annotations.IdRef(id = 14L)
	@de.ls5.dywa.annotations.OriginalName(name = "username")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	void setusername(java.lang.String object);
	

	// EXTENSION ATTRIBUTES

	// CUSTOM LIST IMPL
	static class CustomListImpl<T extends de.ls5.dywa.generated.util.Identifiable> extends java.util.AbstractList<de.ls5.dywa.generated.entity.tictactoe.dime__HYPHEN_MINUS__models.app.BaseUser> {
	
		private final java.util.List<de.ls5.dywa.generated.entity.tictactoe.dime__HYPHEN_MINUS__models.app.BaseUser> delegate;
		private final BiDirectionalHelper<T> bidirectionalHelper;
		private boolean bidirectionalDirtyFlag;
	
		public CustomListImpl(final java.util.List<de.ls5.dywa.generated.entity.tictactoe.dime__HYPHEN_MINUS__models.app.BaseUser> delegate) {
			this(delegate, null);
		}
	
		public CustomListImpl(final java.util.List<de.ls5.dywa.generated.entity.tictactoe.dime__HYPHEN_MINUS__models.app.BaseUser> delegate, final BiDirectionalHelper<T> bidirectionalHelper) {
			this.delegate = delegate;
			this.bidirectionalHelper = bidirectionalHelper;
		}
	
		@java.lang.Override
		public int size() {
			return this.delegate.size();
		}
	
		@java.lang.Override
		public de.ls5.dywa.generated.entity.tictactoe.dime__HYPHEN_MINUS__models.app.BaseUser get(int index) {
				return this.delegate.get(index);
		}
	
		@java.lang.Override
		public de.ls5.dywa.generated.entity.tictactoe.dime__HYPHEN_MINUS__models.app.BaseUser set(int index, de.ls5.dywa.generated.entity.tictactoe.dime__HYPHEN_MINUS__models.app.BaseUser element) {
	
			final de.ls5.dywa.generated.entity.tictactoe.dime__HYPHEN_MINUS__models.app.BaseUser replaced = this.delegate.set(index, element);
	
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
		public void add(int index, de.ls5.dywa.generated.entity.tictactoe.dime__HYPHEN_MINUS__models.app.BaseUser element) {
	
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
		public de.ls5.dywa.generated.entity.tictactoe.dime__HYPHEN_MINUS__models.app.BaseUser remove(int index) {
	
			if (!this.bidirectionalDirtyFlag) {
	
				this.bidirectionalDirtyFlag = true;
				final de.ls5.dywa.generated.entity.tictactoe.dime__HYPHEN_MINUS__models.app.BaseUser result = this.delegate.remove(index);
	
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
	
		final java.util.function.BiConsumer<de.ls5.dywa.generated.entity.tictactoe.dime__HYPHEN_MINUS__models.app.BaseUser, T> setter;
		final java.util.function.Function<de.ls5.dywa.generated.entity.tictactoe.dime__HYPHEN_MINUS__models.app.BaseUser, java.util.List<T>> getter;
		final T owner;
	
		public BiDirectionalHelper(
				java.util.function.BiConsumer<de.ls5.dywa.generated.entity.tictactoe.dime__HYPHEN_MINUS__models.app.BaseUser, T> setter,
				T owner) {
	
			this.setter = setter;
			this.getter = null;
			this.owner = owner;
		}
	
		public BiDirectionalHelper(
				java.util.function.Function<de.ls5.dywa.generated.entity.tictactoe.dime__HYPHEN_MINUS__models.app.BaseUser, java.util.List<T>> getter,
				T owner) {
	
			this.setter = null;
			this.getter = getter;
			this.owner = owner;
		}
	
		public void setReference(final de.ls5.dywa.generated.entity.tictactoe.dime__HYPHEN_MINUS__models.app.BaseUser p) {
	
			// list mode
			if (this.getter != null) {
				getter.apply(p).add(owner);
			}
			// single mode
			else {
				setter.accept(p, owner);
			}
		}
	
		public void clearReference(final de.ls5.dywa.generated.entity.tictactoe.dime__HYPHEN_MINUS__models.app.BaseUser p) {
	
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

	default BaseUser casted(){
		return this;
	}
}