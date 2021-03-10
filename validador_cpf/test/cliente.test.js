Const (Cliente)= require(/models/cliente.js);


test('Dado que eu utilize a função para validar cpf com um número, deveria retornar validar o cpf', () => {
  expect(validarCPF(1)).toBe(false);
});

test('Dado que eu digitei um cpf inválido 11111111111, deveria retornar falso', () => {
  expect(validarCPF("11111111111")).toBe(false);
});

test('Dado que eu digitei um cpf inválido 111111111111, deveria retornar falso', () => {
  expect(validarCPF("111111111111")).toBe(false);
});

test('Dado que eu utilize a função para validar cpf com o valor nulo, deveria retornar falso', () => {
  expect(validarCPF(null)).toBe(false);
});

test('Dado que eu utilize a função para validar cpf sem passar o cpf, deveria retornar falso', () => {
  expect(validarCPF()).toBe(false);
});

test('Dado que eu passe um cpf válido sem pontos e traços então deveria retornar verdadeiro', () => {
  expect(validarCPF("85809522041")).toBe(true);
});

test('Dado que eu passe um cpf válido então deveria retornar verdadeiro', () => {
  expect(validarCPF("858.095.220-41")).toBe(true);
});

test('Dado que eu passe um cpf inválido então deveria retornar falso', () => {
  expect(validarCPF("858.095.220-56")).toBe(false);
});