describe('main page', () => {
  it('shows the title', () => {
    cy.visit('http://localhost:3000/');
    cy.wait(1000);
    cy.contains('JUTAI').should('be.visible');
    cy.contains('Java Unit Testing with AI').should('be.visible');

  });

  it('shows error message when wrong file selected', () => {
      cy.visit('http://localhost:3000/');
      cy.wait(1000);
      cy.get('[data-cy="file-input"]').selectFile('cypress/fixtures/wrong-format.txt');
      cy.wait(1000);
      cy.contains('Error!').should('be.visible');
      cy.wait(1000);

  });

  it('shows the contents of the file in the left container', () => {
      cy.visit('http://localhost:3000/');
      cy.wait(1000);
      cy.get('[data-cy="file-input"]').selectFile('cypress/fixtures/AmicableNumber.java');
      cy.wait(1000);
      cy.get('[data-cy="request-block"]').contains('public class AmicableNumber')
      cy.wait(1000);
  });

  it('generates tests', () => {
      cy.visit('http://localhost:3000/');
      cy.wait(1000);
      cy.get('[data-cy="file-input"]').selectFile('cypress/fixtures/AmicableNumber.java');
      cy.get('[data-cy="test-generation-btn"]').should('be.visible').click();
      cy.get('[data-cy="spinner"]').should('be.visible');
      cy.get('[data-cy="spinner"]', { timeout: 50000 }).should('not.exist');
      cy.get('[data-cy="response-block"]').contains('AmicableNumberTest');
  });
})