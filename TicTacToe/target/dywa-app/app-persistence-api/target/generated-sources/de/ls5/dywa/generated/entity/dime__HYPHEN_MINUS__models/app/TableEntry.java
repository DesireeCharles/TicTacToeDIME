/* generated by info.scce.dime.generator.scheme.ModelGenerator */
package de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app;
@de.ls5.dywa.annotations.IdRef(id = 4L)
@de.ls5.dywa.annotations.OriginalName(name = "TableEntry")
@de.ls5.dywa.annotations.ShortDescription(description = "")
@de.ls5.dywa.annotations.LongDescription(description = "")
public interface TableEntry extends de.ls5.dywa.generated.util.Identifiable {
	@de.ls5.dywa.annotations.IdRef(id = 18L)
	@de.ls5.dywa.annotations.OriginalName(name = "value")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	java.lang.String getvalue();
	
	@de.ls5.dywa.annotations.IdRef(id = 18L)
	@de.ls5.dywa.annotations.OriginalName(name = "value")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	void setvalue(java.lang.String object);
	
	@de.ls5.dywa.annotations.IdRef(id = 19L)
	@de.ls5.dywa.annotations.OriginalName(name = "entryState")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState getentryState();
	
	@de.ls5.dywa.annotations.IdRef(id = 19L)
	@de.ls5.dywa.annotations.OriginalName(name = "entryState")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	void setentryState(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState object);
	

	// EXTENSION ATTRIBUTES

	// CUSTOM LIST IMPL
	static class CustomListImpl<T extends de.ls5.dywa.generated.util.Identifiable> extends java.util.AbstractList<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry> {
	
		private final java.util.List<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry> delegate;
		private final BiDirectionalHelper<T> bidirectionalHelper;
		private boolean bidirectionalDirtyFlag;
	
		public CustomListImpl(final java.util.List<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry> delegate) {
			this(delegate, null);
		}
	
		public CustomListImpl(final java.util.List<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry> delegate, final BiDirectionalHelper<T> bidirectionalHelper) {
			this.delegate = delegate;
			this.bidirectionalHelper = bidirectionalHelper;
		}
	
		@java.lang.Override
		public int size() {
			return this.delegate.size();
		}
	
		@java.lang.Override
		public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry get(int index) {
				return this.delegate.get(index);
		}
	
		@java.lang.Override
		public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry set(int index, de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry element) {
	
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry replaced = this.delegate.set(index, element);
	
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
		public void add(int index, de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry element) {
	
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
		public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry remove(int index) {
	
			if (!this.bidirectionalDirtyFlag) {
	
				this.bidirectionalDirtyFlag = true;
				final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry result = this.delegate.remove(index);
	
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
	
		final java.util.function.BiConsumer<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry, T> setter;
		final java.util.function.Function<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry, java.util.List<T>> getter;
		final T owner;
	
		public BiDirectionalHelper(
				java.util.function.BiConsumer<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry, T> setter,
				T owner) {
	
			this.setter = setter;
			this.getter = null;
			this.owner = owner;
		}
	
		public BiDirectionalHelper(
				java.util.function.Function<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry, java.util.List<T>> getter,
				T owner) {
	
			this.setter = null;
			this.getter = getter;
			this.owner = owner;
		}
	
		public void setReference(final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry p) {
	
			// list mode
			if (this.getter != null) {
				getter.apply(p).add(owner);
			}
			// single mode
			else {
				setter.accept(p, owner);
			}
		}
	
		public void clearReference(final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry p) {
	
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

	default TableEntry casted(){
		return this;
	}
}
